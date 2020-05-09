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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListGroupInstanceGroup extends AbstractModel{

    /**
    * Instance group name ID.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Policy type view name.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * Uin that is last edited.
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * Instance group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Number of instances.
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Creation time.
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
     * Get Instance group name ID. 
     * @return InstanceGroupId Instance group name ID.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group name ID.
     * @param InstanceGroupId Instance group name ID.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Policy type view name. 
     * @return ViewName Policy type view name.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Policy type view name.
     * @param ViewName Policy type view name.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get Uin that is last edited. 
     * @return LastEditUin Uin that is last edited.
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set Uin that is last edited.
     * @param LastEditUin Uin that is last edited.
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get Instance group name. 
     * @return GroupName Instance group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Instance group name.
     * @param GroupName Instance group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Number of instances. 
     * @return InstanceSum Number of instances.
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set Number of instances.
     * @param InstanceSum Number of instances.
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time. 
     * @return InsertTime Creation time.
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
     * @param InsertTime Creation time.
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

