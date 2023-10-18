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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClsLogTopicsResponse extends AbstractModel {

    /**
    * Information of logsets in the Shanghai region
    */
    @SerializedName("Logset")
    @Expose
    private LogSetInfo Logset;

    /**
    * Information of log topics in the Shanghai region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Topics")
    @Expose
    private TopicInfo [] Topics;

    /**
    * Information on logsets in regions except Shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraLogset")
    @Expose
    private ExtraLogset [] ExtraLogset;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of logsets in the Shanghai region 
     * @return Logset Information of logsets in the Shanghai region
     */
    public LogSetInfo getLogset() {
        return this.Logset;
    }

    /**
     * Set Information of logsets in the Shanghai region
     * @param Logset Information of logsets in the Shanghai region
     */
    public void setLogset(LogSetInfo Logset) {
        this.Logset = Logset;
    }

    /**
     * Get Information of log topics in the Shanghai region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Topics Information of log topics in the Shanghai region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Information of log topics in the Shanghai region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Topics Information of log topics in the Shanghai region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTopics(TopicInfo [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get Information on logsets in regions except Shanghai
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtraLogset Information on logsets in regions except Shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ExtraLogset [] getExtraLogset() {
        return this.ExtraLogset;
    }

    /**
     * Set Information on logsets in regions except Shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExtraLogset Information on logsets in regions except Shanghai
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtraLogset(ExtraLogset [] ExtraLogset) {
        this.ExtraLogset = ExtraLogset;
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

    public ListClsLogTopicsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClsLogTopicsResponse(ListClsLogTopicsResponse source) {
        if (source.Logset != null) {
            this.Logset = new LogSetInfo(source.Logset);
        }
        if (source.Topics != null) {
            this.Topics = new TopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new TopicInfo(source.Topics[i]);
            }
        }
        if (source.ExtraLogset != null) {
            this.ExtraLogset = new ExtraLogset[source.ExtraLogset.length];
            for (int i = 0; i < source.ExtraLogset.length; i++) {
                this.ExtraLogset[i] = new ExtraLogset(source.ExtraLogset[i]);
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
        this.setParamObj(map, prefix + "Logset.", this.Logset);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamArrayObj(map, prefix + "ExtraLogset.", this.ExtraLogset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

