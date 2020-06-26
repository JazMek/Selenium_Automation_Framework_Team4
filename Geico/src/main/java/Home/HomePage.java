package Home;

import common.WebAPI;

import java.io.IOException;

public class HomePage extends WebAPI {
    //**** Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
}
