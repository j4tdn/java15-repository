package Ex05Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex05CreateNewFile {
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			try {
				boolean flag = file.createNewFile();
				if (flag) {
					System.out.println("Create file " + file.getName() + " successful.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File " + file.getName() + " already existed !!!");
		}
		return file;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			return (List<T>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}

		System.out.println("Read object completely ...");
		return null;
	}

	public static void close(AutoCloseable... closeables) {
		for (AutoCloseable closeable : closeables) {
			if (closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
