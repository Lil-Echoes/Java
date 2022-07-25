package ni;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReader1Ex {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path, StandardOpenOption.READ);
		ByteBuffer bb = ByteBuffer.allocate(100);
		Charset charset = Charset.defaultCharset();
		String data = "";
		int byteCount;
		while(true) {
			byteCount = fc.read(bb);
			if(byteCount == -1) break;			// -1은 더이상 읽을 데이터가 없다
			bb.flip();
			data += charset.decode(bb).toString();
			bb.clear();
		}
		fc.close();
		System.out.println("읽은 데이터 : "+data);
		
	}

}
