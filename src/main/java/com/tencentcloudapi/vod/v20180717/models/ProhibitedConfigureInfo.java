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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProhibitedConfigureInfo extends AbstractModel {

    /**
    * Control parameter of prohibited information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private ProhibitedAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * Control parameter of prohibited information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private ProhibitedOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameter of prohibited information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrReviewInfo Control parameter of prohibited information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProhibitedAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of prohibited information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrReviewInfo Control parameter of prohibited information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrReviewInfo(ProhibitedAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of prohibited information detection in text.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrReviewInfo Control parameter of prohibited information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProhibitedOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of prohibited information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrReviewInfo Control parameter of prohibited information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrReviewInfo(ProhibitedOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public ProhibitedConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProhibitedConfigureInfo(ProhibitedConfigureInfo source) {
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new ProhibitedAsrReviewTemplateInfo(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new ProhibitedOcrReviewTemplateInfo(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

