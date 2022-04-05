import link.tappii.tappii_connect_api_sdk.v1.Tag;
import link.tappii.tappii_connect_api_sdk.v1.TappiiConnectApi;

public class Example {

    public static void main(String[] argv)
    {
        String accessToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIxNjQ5MTM3Mjc1IiwianRpIjoiZmMyNGE2NDRmOWY4Y2ZjY2I5ODVlYzFhZWMzZDRiZTQyNDFlYzRjMzUyZjMwY2E5OWRlMTRmYTIxZTFiYWUwOWM1MTg0MGUyMTFiNzNmZDkiLCJpYXQiOjE2NDkxMzcyODAuNDUwOTk0LCJuYmYiOjE2NDkxMzcyODAuNDUwOTk3LCJleHAiOjI0MzgwNTU2ODAuNDQwNTksInN1YiI6IjIiLCJzY29wZXMiOltdfQ.eKbrAGBCIBDVWoAqQnbM55nVcwczOnTGX-zHdaPd79O9cHNGJmK2CV0QzoN-8GJomdc9ZR6vcozHr2rbUmU3ta6dkOHF6mz3WCsk-O5solIrghNYJy1CnrCfR9Jawpf9V-clgDAzO67cBdBHy6cizek78YWOn37XGvkGntJ4Vw7H-if8Zlvl6v8FBroFMbcCcB4L_Nc_9tNnJTijnm-Ppg-lOGkK7aXGipJPjVZJjmFNHPIZg192M7zz16i-FzDozui7tTGiO8crlqvggvr1JBr-wq82U_i8A-uCOBvhepmVdlBORSSYnxditU5lIietaXDtYIQ_e3Pb7_yZ-bxAy4_yb1mZN5UCpqSeztVGFokZ6-zS2bVOok0aKk0bXLLpz7zBn0W9NR0kZTmSuoR7Xx05NNxfstF90Z2kaA4VpiNLxt4jUl3GGQ62ksFJLNXN07r_-6LIFEbnvMXYBeYBQA2aAxPeGXePb2-M1AxARg16rRGLWkUq0zlOina-zldld7yQj2Z3OEH3wecXwWI9y9lyyRi7A_nN0ON-EmrMAfHCbheXxmhDDY7E1As4p1TMQBkl0VoutFOv-jrW6G5wRJ-V2oCcw0mJMY2mevUsjUTu2uRR_R0Zcpb22ExvDFMUeopQmCXxE2AyQEVt_JqSXHh0talN15M9fSLDs1cs3Ic";

        TappiiConnectApi tappii = new TappiiConnectApi(accessToken);

        Tag[] tags = tappii.getTags();

        for (Tag tag : tags) {
            String name = tag.getName();
            System.out.println(name);
        }
    }
}
