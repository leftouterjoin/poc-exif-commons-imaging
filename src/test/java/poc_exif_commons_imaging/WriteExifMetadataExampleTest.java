package poc_exif_commons_imaging;

import java.io.File;

import org.junit.Test;

public class WriteExifMetadataExampleTest {

	@Test
	public void test() throws Throwable {
		new WriteExifMetadataExample().removeExifMetadata(
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o.jpg"),
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o_EDIT.jpg"));
	}

	@Test
	public void test2() throws Throwable {
		new WriteExifMetadataExample().changeExifMetadata(
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o.jpg"),
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o_EDIT.jpg"));
	}

	@Test
	public void test3() throws Throwable {
		new WriteExifMetadataExample().setExifGPSTag(
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o.jpg"),
				new File("C:\\Users\\lefto\\Downloads\\flickr\\test2\\20170814-150511-6_36561788895_o_EDIT.jpg"));
	}
}
