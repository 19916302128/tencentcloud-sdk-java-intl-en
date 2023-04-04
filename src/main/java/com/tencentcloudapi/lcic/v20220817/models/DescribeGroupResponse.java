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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupResponse extends AbstractModel{

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * The group type. 0: Ordinary group. 1: Merged group. If the group queried is a merged group, the IDs of the sub-groups will be returned.
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubGroupIds")
    @Expose
    private String [] SubGroupIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The group name. 
     * @return GroupName The group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The group name.
     * @param GroupName The group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeacherId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeacherId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get The group type. 0: Ordinary group. 1: Merged group. If the group queried is a merged group, the IDs of the sub-groups will be returned. 
     * @return GroupType The group type. 0: Ordinary group. 1: Merged group. If the group queried is a merged group, the IDs of the sub-groups will be returned.
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set The group type. 0: Ordinary group. 1: Merged group. If the group queried is a merged group, the IDs of the sub-groups will be returned.
     * @param GroupType The group type. 0: Ordinary group. 1: Merged group. If the group queried is a merged group, the IDs of the sub-groups will be returned.
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubGroupIds 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubGroupIds() {
        return this.SubGroupIds;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubGroupIds 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubGroupIds(String [] SubGroupIds) {
        this.SubGroupIds = SubGroupIds;
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

    public DescribeGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupResponse(DescribeGroupResponse source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.SubGroupIds != null) {
            this.SubGroupIds = new String[source.SubGroupIds.length];
            for (int i = 0; i < source.SubGroupIds.length; i++) {
                this.SubGroupIds[i] = new String(source.SubGroupIds[i]);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "SubGroupIds.", this.SubGroupIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

