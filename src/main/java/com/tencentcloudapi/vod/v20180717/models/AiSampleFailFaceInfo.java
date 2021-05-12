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

public class AiSampleFailFaceInfo extends AbstractModel{

    /**
    * It corresponds to incorrect image subscripts in the `FaceContents` input parameter, starting from 0.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Error code. Valid values:
<li>0: success;</li>
<li>Other values: failure.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get It corresponds to incorrect image subscripts in the `FaceContents` input parameter, starting from 0. 
     * @return Index It corresponds to incorrect image subscripts in the `FaceContents` input parameter, starting from 0.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set It corresponds to incorrect image subscripts in the `FaceContents` input parameter, starting from 0.
     * @param Index It corresponds to incorrect image subscripts in the `FaceContents` input parameter, starting from 0.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Error code. Valid values:
<li>0: success;</li>
<li>Other values: failure.</li> 
     * @return ErrCode Error code. Valid values:
<li>0: success;</li>
<li>Other values: failure.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. Valid values:
<li>0: success;</li>
<li>Other values: failure.</li>
     * @param ErrCode Error code. Valid values:
<li>0: success;</li>
<li>Other values: failure.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public AiSampleFailFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSampleFailFaceInfo(AiSampleFailFaceInfo source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

