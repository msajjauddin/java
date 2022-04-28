
import java.nio.channels.*;
import java.nio.file.*;

class Program {


	public static void main(String[] args)throws Exception{
		var doc = Path.of(args[0]);
		try(var channel = FileChannel.open(doc, StandardOpenOption.READ, StandardOpenOption.WRITE)){
			int n = (int)channel.size();
			var lock = channel.lock();
			var buffer = channel.map(FileChannel.MapMode.READ_WRITE,0,n);
			Transformer.transform(buffer, n);
			lock.release();

		}



	 }




}











