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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaResultResponse extends AbstractModel {

    /**
    * `1 OK`: Verification passed
`7 captcha no match`: The passed in `Randstr` is invalid. Make sure it is the same as the `Randstr` returned from the frontend.
`8 ticket expired`: The `Ticket` has expired. A ticket is valid for five minutes. Please generate a new `Ticket` and `Randstr`.
`9 ticket reused`: The specified `Ticket` has been used. Please generate a new `Ticket` and `Randstr`.
`15 decrypt fail`: The specified `Ticket` is invalid. Make sure it’s the same as the Ticket returned from the frontend. 
`16 appid-ticket mismatch`: The specified `CaptchaAppId` is invalid. Make sure it’s the same as the `CaptchaAppId` returned from the frontend. You can obtain it from the CAPTCHA console in **Verification management** > **Basic configuration**.
`21 diff`. Ticket verification error. Possible reasons: 1) If the ticket contains the `terror` prefix, it’s usually the case that a disaster recovery ticket is generated due to the network connection problems of the user. You can choose to ignore it or verify again. 2) If the ticket does not include the `terror` prefix, Captcha detects security risk on this request . You can choose to block it or not.
`100 appid-secretkey-ticket mismatch`: Parameter error. 1) Make sure `CaptchaAppId` and `AppSecretKey` are correct. `CaptchaAppId` and `AppSecretKey` in the CAPTACHA console under **Verification management** > **Basic configuration**. 2) Make sure the passed-in `Ticket` is generated by using the passed-in `CaptchaAppId`.
    */
    @SerializedName("CaptchaCode")
    @Expose
    private Long CaptchaCode;

    /**
    * Status description and verification error message
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("CaptchaMsg")
    @Expose
    private String CaptchaMsg;

    /**
    * This parameter returns the result of imperceptible verification. This parameter is not available for Tencent Cloud International yet.
`0`: The request is trusted.
`100`: The request is malicious.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EvilLevel")
    @Expose
    private Long EvilLevel;

    /**
    * The timestamp when the frontend obtains the CAPTCHA.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("GetCaptchaTime")
    @Expose
    private Long GetCaptchaTime;

    /**
    * Blocking type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EvilBitmap")
    @Expose
    private Long EvilBitmap;

    /**
    * The time when the CAPTCHA is submitted.
    */
    @SerializedName("SubmitCaptchaTime")
    @Expose
    private Long SubmitCaptchaTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `1 OK`: Verification passed
`7 captcha no match`: The passed in `Randstr` is invalid. Make sure it is the same as the `Randstr` returned from the frontend.
`8 ticket expired`: The `Ticket` has expired. A ticket is valid for five minutes. Please generate a new `Ticket` and `Randstr`.
`9 ticket reused`: The specified `Ticket` has been used. Please generate a new `Ticket` and `Randstr`.
`15 decrypt fail`: The specified `Ticket` is invalid. Make sure it’s the same as the Ticket returned from the frontend. 
`16 appid-ticket mismatch`: The specified `CaptchaAppId` is invalid. Make sure it’s the same as the `CaptchaAppId` returned from the frontend. You can obtain it from the CAPTCHA console in **Verification management** > **Basic configuration**.
`21 diff`. Ticket verification error. Possible reasons: 1) If the ticket contains the `terror` prefix, it’s usually the case that a disaster recovery ticket is generated due to the network connection problems of the user. You can choose to ignore it or verify again. 2) If the ticket does not include the `terror` prefix, Captcha detects security risk on this request . You can choose to block it or not.
`100 appid-secretkey-ticket mismatch`: Parameter error. 1) Make sure `CaptchaAppId` and `AppSecretKey` are correct. `CaptchaAppId` and `AppSecretKey` in the CAPTACHA console under **Verification management** > **Basic configuration**. 2) Make sure the passed-in `Ticket` is generated by using the passed-in `CaptchaAppId`. 
     * @return CaptchaCode `1 OK`: Verification passed
`7 captcha no match`: The passed in `Randstr` is invalid. Make sure it is the same as the `Randstr` returned from the frontend.
`8 ticket expired`: The `Ticket` has expired. A ticket is valid for five minutes. Please generate a new `Ticket` and `Randstr`.
`9 ticket reused`: The specified `Ticket` has been used. Please generate a new `Ticket` and `Randstr`.
`15 decrypt fail`: The specified `Ticket` is invalid. Make sure it’s the same as the Ticket returned from the frontend. 
`16 appid-ticket mismatch`: The specified `CaptchaAppId` is invalid. Make sure it’s the same as the `CaptchaAppId` returned from the frontend. You can obtain it from the CAPTCHA console in **Verification management** > **Basic configuration**.
`21 diff`. Ticket verification error. Possible reasons: 1) If the ticket contains the `terror` prefix, it’s usually the case that a disaster recovery ticket is generated due to the network connection problems of the user. You can choose to ignore it or verify again. 2) If the ticket does not include the `terror` prefix, Captcha detects security risk on this request . You can choose to block it or not.
`100 appid-secretkey-ticket mismatch`: Parameter error. 1) Make sure `CaptchaAppId` and `AppSecretKey` are correct. `CaptchaAppId` and `AppSecretKey` in the CAPTACHA console under **Verification management** > **Basic configuration**. 2) Make sure the passed-in `Ticket` is generated by using the passed-in `CaptchaAppId`.
     */
    public Long getCaptchaCode() {
        return this.CaptchaCode;
    }

    /**
     * Set `1 OK`: Verification passed
`7 captcha no match`: The passed in `Randstr` is invalid. Make sure it is the same as the `Randstr` returned from the frontend.
`8 ticket expired`: The `Ticket` has expired. A ticket is valid for five minutes. Please generate a new `Ticket` and `Randstr`.
`9 ticket reused`: The specified `Ticket` has been used. Please generate a new `Ticket` and `Randstr`.
`15 decrypt fail`: The specified `Ticket` is invalid. Make sure it’s the same as the Ticket returned from the frontend. 
`16 appid-ticket mismatch`: The specified `CaptchaAppId` is invalid. Make sure it’s the same as the `CaptchaAppId` returned from the frontend. You can obtain it from the CAPTCHA console in **Verification management** > **Basic configuration**.
`21 diff`. Ticket verification error. Possible reasons: 1) If the ticket contains the `terror` prefix, it’s usually the case that a disaster recovery ticket is generated due to the network connection problems of the user. You can choose to ignore it or verify again. 2) If the ticket does not include the `terror` prefix, Captcha detects security risk on this request . You can choose to block it or not.
`100 appid-secretkey-ticket mismatch`: Parameter error. 1) Make sure `CaptchaAppId` and `AppSecretKey` are correct. `CaptchaAppId` and `AppSecretKey` in the CAPTACHA console under **Verification management** > **Basic configuration**. 2) Make sure the passed-in `Ticket` is generated by using the passed-in `CaptchaAppId`.
     * @param CaptchaCode `1 OK`: Verification passed
`7 captcha no match`: The passed in `Randstr` is invalid. Make sure it is the same as the `Randstr` returned from the frontend.
`8 ticket expired`: The `Ticket` has expired. A ticket is valid for five minutes. Please generate a new `Ticket` and `Randstr`.
`9 ticket reused`: The specified `Ticket` has been used. Please generate a new `Ticket` and `Randstr`.
`15 decrypt fail`: The specified `Ticket` is invalid. Make sure it’s the same as the Ticket returned from the frontend. 
`16 appid-ticket mismatch`: The specified `CaptchaAppId` is invalid. Make sure it’s the same as the `CaptchaAppId` returned from the frontend. You can obtain it from the CAPTCHA console in **Verification management** > **Basic configuration**.
`21 diff`. Ticket verification error. Possible reasons: 1) If the ticket contains the `terror` prefix, it’s usually the case that a disaster recovery ticket is generated due to the network connection problems of the user. You can choose to ignore it or verify again. 2) If the ticket does not include the `terror` prefix, Captcha detects security risk on this request . You can choose to block it or not.
`100 appid-secretkey-ticket mismatch`: Parameter error. 1) Make sure `CaptchaAppId` and `AppSecretKey` are correct. `CaptchaAppId` and `AppSecretKey` in the CAPTACHA console under **Verification management** > **Basic configuration**. 2) Make sure the passed-in `Ticket` is generated by using the passed-in `CaptchaAppId`.
     */
    public void setCaptchaCode(Long CaptchaCode) {
        this.CaptchaCode = CaptchaCode;
    }

    /**
     * Get Status description and verification error message
Note: This field may return `null`, indicating that no valid value was found. 
     * @return CaptchaMsg Status description and verification error message
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getCaptchaMsg() {
        return this.CaptchaMsg;
    }

    /**
     * Set Status description and verification error message
Note: This field may return `null`, indicating that no valid value was found.
     * @param CaptchaMsg Status description and verification error message
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setCaptchaMsg(String CaptchaMsg) {
        this.CaptchaMsg = CaptchaMsg;
    }

    /**
     * Get This parameter returns the result of imperceptible verification. This parameter is not available for Tencent Cloud International yet.
`0`: The request is trusted.
`100`: The request is malicious.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EvilLevel This parameter returns the result of imperceptible verification. This parameter is not available for Tencent Cloud International yet.
`0`: The request is trusted.
`100`: The request is malicious.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getEvilLevel() {
        return this.EvilLevel;
    }

    /**
     * Set This parameter returns the result of imperceptible verification. This parameter is not available for Tencent Cloud International yet.
`0`: The request is trusted.
`100`: The request is malicious.
Note: This field may return `null`, indicating that no valid value was found.
     * @param EvilLevel This parameter returns the result of imperceptible verification. This parameter is not available for Tencent Cloud International yet.
`0`: The request is trusted.
`100`: The request is malicious.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEvilLevel(Long EvilLevel) {
        this.EvilLevel = EvilLevel;
    }

    /**
     * Get The timestamp when the frontend obtains the CAPTCHA.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return GetCaptchaTime The timestamp when the frontend obtains the CAPTCHA.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getGetCaptchaTime() {
        return this.GetCaptchaTime;
    }

    /**
     * Set The timestamp when the frontend obtains the CAPTCHA.
Note: This field may return `null`, indicating that no valid value was found.
     * @param GetCaptchaTime The timestamp when the frontend obtains the CAPTCHA.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setGetCaptchaTime(Long GetCaptchaTime) {
        this.GetCaptchaTime = GetCaptchaTime;
    }

    /**
     * Get Blocking type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EvilBitmap Blocking type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEvilBitmap() {
        return this.EvilBitmap;
    }

    /**
     * Set Blocking type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EvilBitmap Blocking type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEvilBitmap(Long EvilBitmap) {
        this.EvilBitmap = EvilBitmap;
    }

    /**
     * Get The time when the CAPTCHA is submitted. 
     * @return SubmitCaptchaTime The time when the CAPTCHA is submitted.
     */
    public Long getSubmitCaptchaTime() {
        return this.SubmitCaptchaTime;
    }

    /**
     * Set The time when the CAPTCHA is submitted.
     * @param SubmitCaptchaTime The time when the CAPTCHA is submitted.
     */
    public void setSubmitCaptchaTime(Long SubmitCaptchaTime) {
        this.SubmitCaptchaTime = SubmitCaptchaTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCaptchaResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaResultResponse(DescribeCaptchaResultResponse source) {
        if (source.CaptchaCode != null) {
            this.CaptchaCode = new Long(source.CaptchaCode);
        }
        if (source.CaptchaMsg != null) {
            this.CaptchaMsg = new String(source.CaptchaMsg);
        }
        if (source.EvilLevel != null) {
            this.EvilLevel = new Long(source.EvilLevel);
        }
        if (source.GetCaptchaTime != null) {
            this.GetCaptchaTime = new Long(source.GetCaptchaTime);
        }
        if (source.EvilBitmap != null) {
            this.EvilBitmap = new Long(source.EvilBitmap);
        }
        if (source.SubmitCaptchaTime != null) {
            this.SubmitCaptchaTime = new Long(source.SubmitCaptchaTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaCode", this.CaptchaCode);
        this.setParamSimple(map, prefix + "CaptchaMsg", this.CaptchaMsg);
        this.setParamSimple(map, prefix + "EvilLevel", this.EvilLevel);
        this.setParamSimple(map, prefix + "GetCaptchaTime", this.GetCaptchaTime);
        this.setParamSimple(map, prefix + "EvilBitmap", this.EvilBitmap);
        this.setParamSimple(map, prefix + "SubmitCaptchaTime", this.SubmitCaptchaTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

