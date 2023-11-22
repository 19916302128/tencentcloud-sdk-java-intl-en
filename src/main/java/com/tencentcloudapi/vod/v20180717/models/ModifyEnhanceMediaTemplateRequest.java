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

public class ModifyEnhanceMediaTemplateRequest extends AbstractModel {

    /**
    * Enhance Media Template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Audio and video quality rebirth template name, length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description information, length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Media quality Enhance video control control information.
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * Media quality Enhance audio control control information.
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * Output target video control information.
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * Output target audio control information.
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

    /**
    * Output file encapsulation format, optional values: mp4, flv, hls.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Whether to remove video data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get Enhance Media Template ID. 
     * @return Definition Enhance Media Template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Enhance Media Template ID.
     * @param Definition Enhance Media Template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b> 
     * @return SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     * @param SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Audio and video quality rebirth template name, length limit: 64 characters. 
     * @return Name Audio and video quality rebirth template name, length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio and video quality rebirth template name, length limit: 64 characters.
     * @param Name Audio and video quality rebirth template name, length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description information, length limit: 256 characters. 
     * @return Comment Template description information, length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information, length limit: 256 characters.
     * @param Comment Template description information, length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Media quality Enhance video control control information. 
     * @return RebuildVideoInfo Media quality Enhance video control control information.
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set Media quality Enhance video control control information.
     * @param RebuildVideoInfo Media quality Enhance video control control information.
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get Media quality Enhance audio control control information. 
     * @return RebuildAudioInfo Media quality Enhance audio control control information.
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set Media quality Enhance audio control control information.
     * @param RebuildAudioInfo Media quality Enhance audio control control information.
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get Output target video control information. 
     * @return TargetVideoInfo Output target video control information.
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set Output target video control information.
     * @param TargetVideoInfo Output target video control information.
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get Output target audio control information. 
     * @return TargetAudioInfo Output target audio control information.
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set Output target audio control information.
     * @param TargetAudioInfo Output target audio control information.
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
    }

    /**
     * Get Output file encapsulation format, optional values: mp4, flv, hls. 
     * @return Container Output file encapsulation format, optional values: mp4, flv, hls.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Output file encapsulation format, optional values: mp4, flv, hls.
     * @param Container Output file encapsulation format, optional values: mp4, flv, hls.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Whether to remove video data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0. 
     * @return RemoveVideo Whether to remove video data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     * @param RemoveVideo Whether to remove video data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0. 
     * @return RemoveAudio Whether to remove audio data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     * @param RemoveAudio Whether to remove audio data, optional values:
<li>0: Keep</li>
<li>1: Remove</li>
Default value 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public ModifyEnhanceMediaTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnhanceMediaTemplateRequest(ModifyEnhanceMediaTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.RebuildVideoInfo != null) {
            this.RebuildVideoInfo = new RebuildVideoInfo(source.RebuildVideoInfo);
        }
        if (source.RebuildAudioInfo != null) {
            this.RebuildAudioInfo = new RebuildAudioInfo(source.RebuildAudioInfo);
        }
        if (source.TargetVideoInfo != null) {
            this.TargetVideoInfo = new RebuildMediaTargetVideoStream(source.TargetVideoInfo);
        }
        if (source.TargetAudioInfo != null) {
            this.TargetAudioInfo = new RebuildMediaTargetAudioStream(source.TargetAudioInfo);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}
