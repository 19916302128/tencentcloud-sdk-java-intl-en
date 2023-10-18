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

public class TerrorismConfigureInfoForUpdate extends AbstractModel {

    /**
    * Parameters for recognition of terrorism content in images
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * Parameters for OCR-based recognition of terrorism content
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Parameters for recognition of terrorism content in images 
     * @return ImgReviewInfo Parameters for recognition of terrorism content in images
     */
    public TerrorismImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Parameters for recognition of terrorism content in images
     * @param ImgReviewInfo Parameters for recognition of terrorism content in images
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Parameters for OCR-based recognition of terrorism content 
     * @return OcrReviewInfo Parameters for OCR-based recognition of terrorism content
     */
    public TerrorismOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Parameters for OCR-based recognition of terrorism content
     * @param OcrReviewInfo Parameters for OCR-based recognition of terrorism content
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public TerrorismConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismConfigureInfoForUpdate(TerrorismConfigureInfoForUpdate source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new TerrorismImgReviewTemplateInfoForUpdate(source.ImgReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new TerrorismOcrReviewTemplateInfoForUpdate(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

