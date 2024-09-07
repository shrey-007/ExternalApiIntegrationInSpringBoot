package com.example.ExternalAPI.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
/**
 * {
 *     "success": true,
 *     "message": "",
 *     "data": {
 *         "id": "162479",
 *         "name": "Apple",
 *         "universalName": "apple",
 *         "linkedinUrl": "https://www.linkedin.com/company/apple",
 *         "tagline": "",
 *         "description": "We’re a diverse collective of thinkers and doers, continually reimagining what’s possible to help us all do what we love in new ways. And the same innovation that goes into our products also applies to our practices — strengthening our commitment to leave the world better than we found it. This is where your work can make a difference in people’s lives. Including your own.\n\nApple is an equal opportunity employer that is committed to inclusion and diversity. Visit apple.com/careers to learn more.",
 *         "type": "Public Company",
 *         "phone": "",
 *         "Images": {
 *             "logo": "https://media.licdn.com/dms/image/v2/C560BAQHdAaarsO-eyA/company-logo_400_400/company-logo_400_400/0/1630637844948/apple_logo?e=1733961600&v=beta&t=mCK1b-aHvhXoyjPo4p5Ss4-1PL6AR0jtySiqb88DEf0",
 *             "cover": "https://media.licdn.com/dms/image/v2/C4E1BAQFcckDwSlhOVg/company-background_10000/company-background_10000/0/1584537393991/apple_cover?e=1726290000&v=beta&t=Tbza10-tgdYH_5mtoterbgfjKAtL5dSwbt05hZyv14E"
 *         },
 *         "backgroundCoverImages": [
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C4E1BAQFcckDwSlhOVg/company-background_10000/company-background_10000/0/1584537393991/apple_cover?e=1726290000&v=beta&t=Tbza10-tgdYH_5mtoterbgfjKAtL5dSwbt05hZyv14E",
 *                 "width": 1128,
 *                 "height": 191
 *             },
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C4E1BAQFcckDwSlhOVg/company-background_400/company-background_400/0/1584537394025/apple_cover?e=1726290000&v=beta&t=Yjfuf7f4FPfZIzl8DWOqa-3FFjJtI9aI8ZhyIzS4Uu4",
 *                 "width": 400,
 *                 "height": 67
 *             },
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C4E1BAQFcckDwSlhOVg/company-background_200/company-background_200/0/1584537394195/apple_cover?e=1726290000&v=beta&t=mF3k2n8hm951Xmk6vUBZn4OVdKnliA6jKCYZ4qBDvTA",
 *                 "width": 200,
 *                 "height": 33
 *             }
 *         ],
 *         "logos": [
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C560BAQHdAaarsO-eyA/company-logo_200_200/company-logo_200_200/0/1630637844948/apple_logo?e=1733961600&v=beta&t=WrJr-AXEPwOlmvydwcq8TdF4h-BBJCkV760vLiJjgXs",
 *                 "width": 200,
 *                 "height": 200
 *             },
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C560BAQHdAaarsO-eyA/company-logo_100_100/company-logo_100_100/0/1630637844948/apple_logo?e=1733961600&v=beta&t=1mg-46gqXKy2d8VxCqILkBVXUUobOICCrsfxChs_cbI",
 *                 "width": 100,
 *                 "height": 100
 *             },
 *             {
 *                 "url": "https://media.licdn.com/dms/image/v2/C560BAQHdAaarsO-eyA/company-logo_400_400/company-logo_400_400/0/1630637844948/apple_logo?e=1733961600&v=beta&t=mCK1b-aHvhXoyjPo4p5Ss4-1PL6AR0jtySiqb88DEf0",
 *                 "width": 400,
 *                 "height": 400
 *             }
 *         ],
 *         "staffCount": 169030,
 *         "headquarter": {
 *             "geographicArea": "California",
 *             "country": "US",
 *             "city": "Cupertino",
 *             "postalCode": "95014",
 *             "line1": "1 Apple Park Way"
 *         },
 *         "locations": [
 *             {
 *                 "geographicArea": "California",
 *                 "country": "US",
 *                 "city": "Cupertino",
 *                 "postalCode": "95014",
 *                 "description": "Corporate Headquarters",
 *                 "headquarter": true,
 *                 "line1": "1 Apple Park Way"
 *             }
 *         ],
 *         "industries": [
 *             "Computers and Electronics Manufacturing"
 *         ],
 *         "specialities": [
 *             "Innovative Product Development",
 *             "World-Class Operations",
 *             "Retail",
 *             "Telephone Support"
 *         ],
 *         "website": "http://www.apple.com/careers",
 *         "founded": {
 *             "year": 1976
 *         },
 *         "callToAction": {
 *             "callToActionType": "VIEW_WEBSITE",
 *             "visible": true,
 *             "callToActionMessage": {
 *                 "textDirection": "USER_LOCALE",
 *                 "text": "Visit website"
 *             },
 *             "url": "http://www.apple.com/careers"
 *         },
 *         "followerCount": 17583179,
 *         "staffCountRange": "10001+",
 *         "crunchbaseUrl": "https://www.crunchbase.com/organization/apple",
 *         "fundingData": {
 *             "updatedAt": "1701686360",
 *             "updatedDate": "2023-12-04 10:39:20 +0000 UTC",
 *             "numFundingRounds": 7,
 *             "lastFundingRound": {
 *                 "investorsCrunchbaseUrl": "https://www.crunchbase.com/funding_round/apple-post-ipo-equity--45845def",
 *                 "leadInvestors": null,
 *                 "fundingRoundCrunchbaseUrl": "https://www.crunchbase.com/funding_round/apple-post-ipo-equity--45845def?utm_source=linkedin&utm_medium=referral&utm_campaign=linkedin_companies&utm_content=last_funding",
 *                 "fundingType": "POST_IPO_EQUITY",
 *                 "moneyRaised": {
 *                     "currencyCode": "",
 *                     "amount": ""
 *                 },
 *                 "numOtherInvestors": 1,
 *                 "announcedOn": {
 *                     "month": 4,
 *                     "day": 30,
 *                     "year": 2021
 *                 }
 *             }
 *         }
 *     }
 * }*/
// we have to annotate it with Json to map json to object
public class ApiResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private Data data;

    // Getters and Setters

    @Getter
    @Setter
    @ToString
    public static class Data {
        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("universalName")
        private String universalName;

        @JsonProperty("linkedinUrl")
        private String linkedinUrl;

        @JsonProperty("tagline")
        private String tagline;

        @JsonProperty("description")
        private String description;

        @JsonProperty("type")
        private String type;

        @JsonProperty("phone")
        private String phone;

        @JsonProperty("Images")
        private Images images;

        @JsonProperty("backgroundCoverImages")
        private List<BackgroundCoverImage> backgroundCoverImages;

        @JsonProperty("logos")
        private List<Logo> logos;

        @JsonProperty("staffCount")
        private int staffCount;

        @JsonProperty("headquarter")
        private Headquarter headquarter;

        @JsonProperty("locations")
        private List<Location> locations;

        @JsonProperty("industries")
        private List<String> industries;

        @JsonProperty("specialities")
        private List<String> specialities;

        @JsonProperty("website")
        private String website;

        @JsonProperty("founded")
        private Founded founded;

        @JsonProperty("callToAction")
        private CallToAction callToAction;

        @JsonProperty("followerCount")
        private int followerCount;

        @JsonProperty("staffCountRange")
        private String staffCountRange;

        @JsonProperty("crunchbaseUrl")
        private String crunchbaseUrl;

        @JsonProperty("fundingData")
        private FundingData fundingData;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class Images {
        @JsonProperty("logo")
        private String logo;

        @JsonProperty("cover")
        private String cover;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class BackgroundCoverImage {
        @JsonProperty("url")
        private String url;

        @JsonProperty("width")
        private int width;

        @JsonProperty("height")
        private int height;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class Logo {
        @JsonProperty("url")
        private String url;

        @JsonProperty("width")
        private int width;

        @JsonProperty("height")
        private int height;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class Headquarter {
        @JsonProperty("geographicArea")
        private String geographicArea;

        @JsonProperty("country")
        private String country;

        @JsonProperty("city")
        private String city;

        @JsonProperty("postalCode")
        private String postalCode;

        @JsonProperty("line1")
        private String line1;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class Location {
        @JsonProperty("geographicArea")
        private String geographicArea;

        @JsonProperty("country")
        private String country;

        @JsonProperty("city")
        private String city;

        @JsonProperty("postalCode")
        private String postalCode;

        @JsonProperty("description")
        private String description;

        @JsonProperty("headquarter")
        private boolean headquarter;

        @JsonProperty("line1")
        private String line1;

        // Getters and Setters
    }


    @Getter
    @Setter
    @ToString
    public static class Founded {
        @JsonProperty("year")
        private int year;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class CallToAction {
        @JsonProperty("callToActionType")
        private String callToActionType;

        @JsonProperty("visible")
        private boolean visible;

        @JsonProperty("callToActionMessage")
        private CallToActionMessage callToActionMessage;

        @JsonProperty("url")
        private String url;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class CallToActionMessage {
        @JsonProperty("textDirection")
        private String textDirection;

        @JsonProperty("text")
        private String text;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class FundingData {
        @JsonProperty("updatedAt")
        private String updatedAt;

        @JsonProperty("updatedDate")
        private String updatedDate;

        @JsonProperty("numFundingRounds")
        private int numFundingRounds;

        @JsonProperty("lastFundingRound")
        private LastFundingRound lastFundingRound;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class LastFundingRound {
        @JsonProperty("investorsCrunchbaseUrl")
        private String investorsCrunchbaseUrl;

        @JsonProperty("leadInvestors")
        private String leadInvestors;

        @JsonProperty("fundingRoundCrunchbaseUrl")
        private String fundingRoundCrunchbaseUrl;

        @JsonProperty("fundingType")
        private String fundingType;

        @JsonProperty("moneyRaised")
        private MoneyRaised moneyRaised;

        @JsonProperty("numOtherInvestors")
        private int numOtherInvestors;

        @JsonProperty("announcedOn")
        private AnnouncedOn announcedOn;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class MoneyRaised {
        @JsonProperty("currencyCode")
        private String currencyCode;

        @JsonProperty("amount")
        private String amount;

        // Getters and Setters
    }

    @Getter
    @Setter
    @ToString
    public static class AnnouncedOn {
        @JsonProperty("month")
        private int month;

        @JsonProperty("day")
        private int day;

        @JsonProperty("year")
        private int year;

        // Getters and Setters
    }
}

