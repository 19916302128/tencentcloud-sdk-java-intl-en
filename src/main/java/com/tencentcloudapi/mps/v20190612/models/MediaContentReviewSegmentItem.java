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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaContentReviewSegmentItem extends AbstractModel{

    /**
    * Start time offset of a suspected segment in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a suspected segment in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Score of a suspected porn segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Tag of porn information detection result of a suspected segment.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start time offset of a suspected segment in seconds. 
     * @return StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a suspected segment in seconds.
     * @param StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a suspected segment in seconds. 
     * @return EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a suspected segment in seconds.
     * @param EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Score of a suspected porn segment. 
     * @return Confidence Score of a suspected porn segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of a suspected porn segment.
     * @param Confidence Score of a suspected porn segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Tag of porn information detection result of a suspected segment. 
     * @return Label Tag of porn information detection result of a suspected segment.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of porn information detection result of a suspected segment.
     * @param Label Tag of porn information detection result of a suspected segment.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`). 
     * @return Url URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     * @param Url URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return PicUrlExpireTime Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param PicUrlExpireTime Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public MediaContentReviewSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaContentReviewSegmentItem(MediaContentReviewSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PicUrlExpireTime != null) {
            this.PicUrlExpireTime = new String(source.PicUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

