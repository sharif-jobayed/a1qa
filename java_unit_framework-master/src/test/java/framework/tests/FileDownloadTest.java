package framework.tests;

import framework.pages.FileDownloadPage;
import framework.pages.MainPageNavigation;
import framework.utils.FileUtil;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;


public class FileDownloadTest extends BaseTest {
    private FileDownloadPage fileDownloadPage = new FileDownloadPage();
    public final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);


    @Test
    public void fileUploadTest() {
        // todo: add test
    }

    @AfterMethod
    public void deleteFile() {
        // todo: add delete file
    }
}
