import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;


public class FileModificationWatcher {

	public static void main(String[] args) throws IOException, InterruptedException {
		//This is supposed to create a new file called 'movies.txt'
		TryWithCloseable.main(args);
		
		WatchService watchService = FileSystems.getDefault().newWatchService();
		
		Path dirToWatch = Paths.get("src");
		System.out.println("Watching " + dirToWatch.toAbsolutePath().toString());
		
		dirToWatch.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
		
		while (true) {
			WatchKey key = watchService.take();
			
			for (WatchEvent<?> watchEvent : key.pollEvents()) {
				Kind<?> kind = watchEvent.kind();
				System.out.println("Event on " + watchEvent.context().toString() + " is " + kind);
			}
			
			if (!key.reset()) {
				break;
			}
		}
	}
	
}
