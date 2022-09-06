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

public class VideoLivenessCompareResponse extends AbstractModel{

    /**
    * The similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two persons are of the same person. You can adjust the threshold according to your specific scenario (the FARs at the thresholds of 70 and 80 are 0.1% and 0.01%, respectively).
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * The service error code. `Success` will be returned for success. For error information, see the `FailedOperation` section in the error code list below.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * The service result description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The best video screenshot after successful verification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BestFrame")
    @Expose
    private FileInfo BestFrame;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two persons are of the same person. You can adjust the threshold according to your specific scenario (the FARs at the thresholds of 70 and 80 are 0.1% and 0.01%, respectively). 
     * @return Sim The similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two persons are of the same person. You can adjust the threshold according to your specific scenario (the FARs at the thresholds of 70 and 80 are 0.1% and 0.01%, respectively).
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set The similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two persons are of the same person. You can adjust the threshold according to your specific scenario (the FARs at the thresholds of 70 and 80 are 0.1% and 0.01%, respectively).
     * @param Sim The similarity. Value range: [0.00, 100.00]. As a recommendation, when the similarity is greater than or equal to 70, it can be determined that the two persons are of the same person. You can adjust the threshold according to your specific scenario (the FARs at the thresholds of 70 and 80 are 0.1% and 0.01%, respectively).
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get The service error code. `Success` will be returned for success. For error information, see the `FailedOperation` section in the error code list below. 
     * @return Result The service error code. `Success` will be returned for success. For error information, see the `FailedOperation` section in the error code list below.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set The service error code. `Success` will be returned for success. For error information, see the `FailedOperation` section in the error code list below.
     * @param Result The service error code. `Success` will be returned for success. For error information, see the `FailedOperation` section in the error code list below.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get The service result description 
     * @return Description The service result description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The service result description
     * @param Description The service result description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The best video screenshot after successful verification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BestFrame The best video screenshot after successful verification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileInfo getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set The best video screenshot after successful verification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BestFrame The best video screenshot after successful verification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBestFrame(FileInfo BestFrame) {
        this.BestFrame = BestFrame;
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

    public VideoLivenessCompareResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoLivenessCompareResponse(VideoLivenessCompareResponse source) {
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new FileInfo(source.BestFrame);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
