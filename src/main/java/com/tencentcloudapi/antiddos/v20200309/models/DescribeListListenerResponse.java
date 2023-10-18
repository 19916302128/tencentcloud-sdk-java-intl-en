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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListListenerResponse extends AbstractModel {

    /**
    * List of layer-4 forwarding listeners
    */
    @SerializedName("Layer4Listeners")
    @Expose
    private Layer4Rule [] Layer4Listeners;

    /**
    * List of layer-7 forwarding listeners
    */
    @SerializedName("Layer7Listeners")
    @Expose
    private Layer7Rule [] Layer7Listeners;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of layer-4 forwarding listeners 
     * @return Layer4Listeners List of layer-4 forwarding listeners
     */
    public Layer4Rule [] getLayer4Listeners() {
        return this.Layer4Listeners;
    }

    /**
     * Set List of layer-4 forwarding listeners
     * @param Layer4Listeners List of layer-4 forwarding listeners
     */
    public void setLayer4Listeners(Layer4Rule [] Layer4Listeners) {
        this.Layer4Listeners = Layer4Listeners;
    }

    /**
     * Get List of layer-7 forwarding listeners 
     * @return Layer7Listeners List of layer-7 forwarding listeners
     */
    public Layer7Rule [] getLayer7Listeners() {
        return this.Layer7Listeners;
    }

    /**
     * Set List of layer-7 forwarding listeners
     * @param Layer7Listeners List of layer-7 forwarding listeners
     */
    public void setLayer7Listeners(Layer7Rule [] Layer7Listeners) {
        this.Layer7Listeners = Layer7Listeners;
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

    public DescribeListListenerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListListenerResponse(DescribeListListenerResponse source) {
        if (source.Layer4Listeners != null) {
            this.Layer4Listeners = new Layer4Rule[source.Layer4Listeners.length];
            for (int i = 0; i < source.Layer4Listeners.length; i++) {
                this.Layer4Listeners[i] = new Layer4Rule(source.Layer4Listeners[i]);
            }
        }
        if (source.Layer7Listeners != null) {
            this.Layer7Listeners = new Layer7Rule[source.Layer7Listeners.length];
            for (int i = 0; i < source.Layer7Listeners.length; i++) {
                this.Layer7Listeners[i] = new Layer7Rule(source.Layer7Listeners[i]);
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
        this.setParamArrayObj(map, prefix + "Layer4Listeners.", this.Layer4Listeners);
        this.setParamArrayObj(map, prefix + "Layer7Listeners.", this.Layer7Listeners);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

