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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectReflectLivenessAndCompareResponse extends AbstractModel{

    /**
    * URL of the best screenshot (in JPG format) of the video after successful verification
    */
    @SerializedName("BestFrameUrl")
    @Expose
    private String BestFrameUrl;

    /**
    * MD5 hash value of the best screenshot of the video after successful verification
    */
    @SerializedName("BestFrameMd5")
    @Expose
    private String BestFrameMd5;

    /**
    * Service error code. `Success` will be returned for success. For error information, please see the `FailedOperation` section in the error code list below.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Service result description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two faces are of the same person. You can adjust the threshold according to your specific scenario (the FAR at the threshold of 70 is 0.1%, and FAR at the threshold of 80 is 0.01%).
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get URL of the best screenshot (in JPG format) of the video after successful verification 
     * @return BestFrameUrl URL of the best screenshot (in JPG format) of the video after successful verification
     */
    public String getBestFrameUrl() {
        return this.BestFrameUrl;
    }

    /**
     * Set URL of the best screenshot (in JPG format) of the video after successful verification
     * @param BestFrameUrl URL of the best screenshot (in JPG format) of the video after successful verification
     */
    public void setBestFrameUrl(String BestFrameUrl) {
        this.BestFrameUrl = BestFrameUrl;
    }

    /**
     * Get MD5 hash value of the best screenshot of the video after successful verification 
     * @return BestFrameMd5 MD5 hash value of the best screenshot of the video after successful verification
     */
    public String getBestFrameMd5() {
        return this.BestFrameMd5;
    }

    /**
     * Set MD5 hash value of the best screenshot of the video after successful verification
     * @param BestFrameMd5 MD5 hash value of the best screenshot of the video after successful verification
     */
    public void setBestFrameMd5(String BestFrameMd5) {
        this.BestFrameMd5 = BestFrameMd5;
    }

    /**
     * Get Service error code. `Success` will be returned for success. For error information, please see the `FailedOperation` section in the error code list below. 
     * @return Result Service error code. `Success` will be returned for success. For error information, please see the `FailedOperation` section in the error code list below.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Service error code. `Success` will be returned for success. For error information, please see the `FailedOperation` section in the error code list below.
     * @param Result Service error code. `Success` will be returned for success. For error information, please see the `FailedOperation` section in the error code list below.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Service result description 
     * @return Description Service result description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Service result description
     * @param Description Service result description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two faces are of the same person. You can adjust the threshold according to your specific scenario (the FAR at the threshold of 70 is 0.1%, and FAR at the threshold of 80 is 0.01%). 
     * @return Sim Similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two faces are of the same person. You can adjust the threshold according to your specific scenario (the FAR at the threshold of 70 is 0.1%, and FAR at the threshold of 80 is 0.01%).
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set Similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two faces are of the same person. You can adjust the threshold according to your specific scenario (the FAR at the threshold of 70 is 0.1%, and FAR at the threshold of 80 is 0.01%).
     * @param Sim Similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two faces are of the same person. You can adjust the threshold according to your specific scenario (the FAR at the threshold of 70 is 0.1%, and FAR at the threshold of 80 is 0.01%).
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
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

    public DetectReflectLivenessAndCompareResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectReflectLivenessAndCompareResponse(DetectReflectLivenessAndCompareResponse source) {
        if (source.BestFrameUrl != null) {
            this.BestFrameUrl = new String(source.BestFrameUrl);
        }
        if (source.BestFrameMd5 != null) {
            this.BestFrameMd5 = new String(source.BestFrameMd5);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BestFrameUrl", this.BestFrameUrl);
        this.setParamSimple(map, prefix + "BestFrameMd5", this.BestFrameMd5);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

