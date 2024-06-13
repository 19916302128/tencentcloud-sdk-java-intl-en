/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeSingaporeIDCardOCRResponse extends AbstractModel {

    /**
    * Chinese name
    */
    @SerializedName("ChName")
    @Expose
    private String ChName;

    /**
    * English name
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * gender
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Birth Country
    */
    @SerializedName("CountryOfBirth")
    @Expose
    private String CountryOfBirth;

    /**
    * Brithday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address(back side)
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * License number
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Nationality(back side)
    */
    @SerializedName("Race")
    @Expose
    private String Race;

    /**
    * NRIC code(back side)
    */
    @SerializedName("NRICCode")
    @Expose
    private String NRICCode;

    /**
    * Post code(back side)
    */
    @SerializedName("PostCode")
    @Expose
    private String PostCode;

    /**
    * Date of Expiration(back side)
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Date of issue(back side)
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
    * Head image 
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Chinese name 
     * @return ChName Chinese name
     */
    public String getChName() {
        return this.ChName;
    }

    /**
     * Set Chinese name
     * @param ChName Chinese name
     */
    public void setChName(String ChName) {
        this.ChName = ChName;
    }

    /**
     * Get English name 
     * @return EnName English name
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name
     * @param EnName English name
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get gender 
     * @return Sex gender
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set gender
     * @param Sex gender
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Birth Country 
     * @return CountryOfBirth Birth Country
     */
    public String getCountryOfBirth() {
        return this.CountryOfBirth;
    }

    /**
     * Set Birth Country
     * @param CountryOfBirth Birth Country
     */
    public void setCountryOfBirth(String CountryOfBirth) {
        this.CountryOfBirth = CountryOfBirth;
    }

    /**
     * Get Brithday 
     * @return Birthday Brithday
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Brithday
     * @param Birthday Brithday
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Address(back side) 
     * @return Address Address(back side)
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address(back side)
     * @param Address Address(back side)
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get License number 
     * @return ID License number
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set License number
     * @param ID License number
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Nationality(back side) 
     * @return Race Nationality(back side)
     */
    public String getRace() {
        return this.Race;
    }

    /**
     * Set Nationality(back side)
     * @param Race Nationality(back side)
     */
    public void setRace(String Race) {
        this.Race = Race;
    }

    /**
     * Get NRIC code(back side) 
     * @return NRICCode NRIC code(back side)
     */
    public String getNRICCode() {
        return this.NRICCode;
    }

    /**
     * Set NRIC code(back side)
     * @param NRICCode NRIC code(back side)
     */
    public void setNRICCode(String NRICCode) {
        this.NRICCode = NRICCode;
    }

    /**
     * Get Post code(back side) 
     * @return PostCode Post code(back side)
     */
    public String getPostCode() {
        return this.PostCode;
    }

    /**
     * Set Post code(back side)
     * @param PostCode Post code(back side)
     */
    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get Date of Expiration(back side) 
     * @return DateOfExpiration Date of Expiration(back side)
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Date of Expiration(back side)
     * @param DateOfExpiration Date of Expiration(back side)
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Date of issue(back side) 
     * @return DateOfIssue Date of issue(back side)
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set Date of issue(back side)
     * @param DateOfIssue Date of issue(back side)
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    /**
     * Get Head image  
     * @return Photo Head image 
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set Head image 
     * @param Photo Head image 
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled. 
     * @return WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     * @param WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeSingaporeIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeSingaporeIDCardOCRResponse(RecognizeSingaporeIDCardOCRResponse source) {
        if (source.ChName != null) {
            this.ChName = new String(source.ChName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.CountryOfBirth != null) {
            this.CountryOfBirth = new String(source.CountryOfBirth);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Race != null) {
            this.Race = new String(source.Race);
        }
        if (source.NRICCode != null) {
            this.NRICCode = new String(source.NRICCode);
        }
        if (source.PostCode != null) {
            this.PostCode = new String(source.PostCode);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChName", this.ChName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "CountryOfBirth", this.CountryOfBirth);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Race", this.Race);
        this.setParamSimple(map, prefix + "NRICCode", this.NRICCode);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

