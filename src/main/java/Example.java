import link.tappii.tappii_connect_api_sdk.v1.Tag;
import link.tappii.tappii_connect_api_sdk.v1.TappiiApi;

public class Example {

    public static void main(String[] argv)
    {
        String accessToken = "";

        TappiiApi tappii = new TappiiApi(accessToken);

        Tag[] tags = tappii.getTags();

        for (Tag tag : tags) {
            String name = tag.getName();
            System.out.println(name);
        }
    }
}
