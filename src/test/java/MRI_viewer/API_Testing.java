package MRI_viewer;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class API_Testing {
	
	@Test(priority=1)
    void Public_5brains() {
        System.out.println("Sending GET request to public 5 brains ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getPublicBrains")
            .then()
            .statusCode(200)
            .log().all();
    }
	@Test(priority=2)
	void Maskimage_141()
	{
		 System.out.println("Sending GET request to mask image of biosample '141'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/141/MRI/stl/brain_small.stl")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	@Test(priority=3)
	void Maskimage_222()
	{
		 System.out.println("Sending GET request to mask image of biosample '222'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/222/MRI/stl/brain_small.stl")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=4)
	void Maskimage_212()
	{
		 System.out.println("Sending GET request to mask image of biosample '212'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/212/MRI/stl/brain_small.stl")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=5)
	void Maskimage_142()
	{
		 System.out.println("Sending GET request to mask image of biosample '142'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get( "https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/142/MRI/stl/brain_small.stl")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=6)
	void Maskimage_213()
	{
		 System.out.println("Sending GET request to mask image of biosample '213'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/213/MRI/stl/brain_small.stl")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=7)
	void MRIimage_222()
	{
		 System.out.println("Sending GET request to MRI image of biosample '222'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/222/MRI/nii/base_oricroppeddefaced_1.nii.gz")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=8)
	void Mapping_222()
	{
		 System.out.println("Sending GET request to mapping of biosample '222'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/GW/getMRIData/100")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=9)
    void B_222_public_sections() 
	{
        System.out.println("Sending GET request to get public sections of biosample:222 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-100?public=1")
            .then()
            .statusCode(200)
            .log().all();
    }
	
	@Test(priority=10)
	void GetBrainviewerdetailsof_B222()
	{
		System.out.println("Sending GET request to get Brainviewer details of 222 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-100:309:710")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=11)
	void Getthumbnailsdetailsof_B222()
	{
		System.out.println("Sending GET request to get thumbnails details of 222 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-100:309:710")
            .then()
            .statusCode(200)
            .log().all();
	}
	
	@Test(priority=12)
	void MRIimage_141()
	{
		 System.out.println("Sending GET request to MRI image of biosample '141'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/141/MRI/nii/FB40.nii.gz")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=13)
    void B_141_public_sections() 
	{
        System.out.println("Sending GET request to get public sections of biosample:141 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-62?public=1")
            .then()
            .statusCode(200)
            .log().all();
    }
	@Test(priority=14)
	void GetBrainviewerdetailsof_B141()
	{
		System.out.println("Sending GET request to get Brainviewer details of 141 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-62:148:745")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=15)
	void Getthumbnailsdetailsof_B141()
	{
		System.out.println("Sending GET request to get thumbnails details of 141 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-62:148:745")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=16)
	void MRIimage_212()
	{
		 System.out.println("Sending GET request to MRI image of biosample '212'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/212/MRI/nii/FB67.nii.gz")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=17)
    void B_212_public_sections() 
	{
        System.out.println("Sending GET request to get public sections of biosample:212 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-88?public=1")
            .then()
            .statusCode(200)
            .log().all();
    }
	@Test(priority=18)
	void GetBrainviewerdetailsof_B212()
	{
		System.out.println("Sending GET request to get Brainviewer details of 212 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-88:268:1030")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=19)
	void Getthumbnailsdetailsof_B212()
	{
		System.out.println("Sending GET request to get thumbnails details of 212 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-88:268:1030")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=20)
	void MRIimage_142()
	{
		 System.out.println("Sending GET request to MRI image of biosample '142'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/142/MRI/nii/FB34.nii.gz")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=21)
    void B_142_public_sections() 
    {
        System.out.println("Sending GET request to get public sections of biosample:142 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-65?public=1")
            .then()
            .statusCode(200)
            .log().all();
    }
	@Test(priority=22)
	void GetBrainviewerdetailsof_B142()
	{
		System.out.println("Sending GET request to get Brainviewer details of 142 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-65:199:986")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=23)
	void Getthumbnailsdetailsof_B142()
	{
		System.out.println("Sending GET request to get thumbnails details of 142 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-65:199:986")
            .then()
            .statusCode(200)
            .log().all();
	}
	
	@Test(priority=24)
	void MRIimage_213()
	{
		 System.out.println("Sending GET request to MRI image of biosample '213'");
	        given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://dataportal.iitm.humanbrain.in/iipsrv/data/storageIIT/humanbrain/analytics/213/MRI/nii/FB62.nii.gz")
	            .then()
	            .statusCode(200)
	            .log().all();
	}
	
	@Test(priority=25)
    void B_213_public_sections() 
    {
        System.out.println("Sending GET request to get public sections of biosample:213 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-94?public=1")
            .then()
            .statusCode(200)
            .log().all();
    }
	@Test(priority=26)
	void GetBrainviewerdetailsof_B213()
	{
		System.out.println("Sending GET request to get Brainviewer details of 213 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-94:253:1088")
            .then()
            .statusCode(200)
            .log().all();
	}
	@Test(priority=27)
	void Getthumbnailsdetailsof_B213()
	{
		System.out.println("Sending GET request to get thumbnails details of 213 ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://dataportal.iitm.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-94:253:1088")
            .then()
            .statusCode(200)
            .log().all();
	}
	
	
	
	
	

}
