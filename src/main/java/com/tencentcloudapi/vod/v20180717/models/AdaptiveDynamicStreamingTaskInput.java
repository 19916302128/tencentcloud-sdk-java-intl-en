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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel{

    /**
    * Adaptive bitrate streaming template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * List of subtitle IDs (maximum: 16)
    */
    @SerializedName("SubtitleSet")
    @Expose
    private String [] SubtitleSet;

    /**
     * Get Adaptive bitrate streaming template ID. 
     * @return Definition Adaptive bitrate streaming template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming template ID.
     * @param Definition Adaptive bitrate streaming template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WatermarkSet List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WatermarkSet List of up to 10 image or text watermarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get List of subtitle IDs (maximum: 16) 
     * @return SubtitleSet List of subtitle IDs (maximum: 16)
     */
    public String [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set List of subtitle IDs (maximum: 16)
     * @param SubtitleSet List of subtitle IDs (maximum: 16)
     */
    public void setSubtitleSet(String [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public AdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTaskInput(AdaptiveDynamicStreamingTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new String[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new String(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamArraySimple(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

