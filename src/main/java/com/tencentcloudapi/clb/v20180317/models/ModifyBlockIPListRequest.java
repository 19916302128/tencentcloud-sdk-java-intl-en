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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIPListRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Operation type. Valid values:
<li> add_customized_field (sets header initially to enable the blacklist feature)</li>
<li> set_customized_field (modifies header)</li>
<li> del_customized_field (deletes header)</li>
<li> add_blocked (adds IPs to blacklist)</li>
<li> del_blocked (deletes IPs from blacklist)</li>
<li> flush_blocked (clears blacklist)</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Header field that stores real client IPs
    */
    @SerializedName("ClientIPField")
    @Expose
    private String ClientIPField;

    /**
    * List of blocked IPs. The array can contain up to 200,000 entries in one operation.
    */
    @SerializedName("BlockIPList")
    @Expose
    private String [] BlockIPList;

    /**
    * Expiration time in seconds. Default value: 3600
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * IP adding policy. Valid value: fifo (if a blacklist is full, new IPs added to the blacklist will adopt the first-in first-out policy)
    */
    @SerializedName("AddStrategy")
    @Expose
    private String AddStrategy;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerIds CLB instance ID
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerIds CLB instance ID
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Operation type. Valid values:
<li> add_customized_field (sets header initially to enable the blacklist feature)</li>
<li> set_customized_field (modifies header)</li>
<li> del_customized_field (deletes header)</li>
<li> add_blocked (adds IPs to blacklist)</li>
<li> del_blocked (deletes IPs from blacklist)</li>
<li> flush_blocked (clears blacklist)</li> 
     * @return Type Operation type. Valid values:
<li> add_customized_field (sets header initially to enable the blacklist feature)</li>
<li> set_customized_field (modifies header)</li>
<li> del_customized_field (deletes header)</li>
<li> add_blocked (adds IPs to blacklist)</li>
<li> del_blocked (deletes IPs from blacklist)</li>
<li> flush_blocked (clears blacklist)</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Operation type. Valid values:
<li> add_customized_field (sets header initially to enable the blacklist feature)</li>
<li> set_customized_field (modifies header)</li>
<li> del_customized_field (deletes header)</li>
<li> add_blocked (adds IPs to blacklist)</li>
<li> del_blocked (deletes IPs from blacklist)</li>
<li> flush_blocked (clears blacklist)</li>
     * @param Type Operation type. Valid values:
<li> add_customized_field (sets header initially to enable the blacklist feature)</li>
<li> set_customized_field (modifies header)</li>
<li> del_customized_field (deletes header)</li>
<li> add_blocked (adds IPs to blacklist)</li>
<li> del_blocked (deletes IPs from blacklist)</li>
<li> flush_blocked (clears blacklist)</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Header field that stores real client IPs 
     * @return ClientIPField Header field that stores real client IPs
     */
    public String getClientIPField() {
        return this.ClientIPField;
    }

    /**
     * Set Header field that stores real client IPs
     * @param ClientIPField Header field that stores real client IPs
     */
    public void setClientIPField(String ClientIPField) {
        this.ClientIPField = ClientIPField;
    }

    /**
     * Get List of blocked IPs. The array can contain up to 200,000 entries in one operation. 
     * @return BlockIPList List of blocked IPs. The array can contain up to 200,000 entries in one operation.
     */
    public String [] getBlockIPList() {
        return this.BlockIPList;
    }

    /**
     * Set List of blocked IPs. The array can contain up to 200,000 entries in one operation.
     * @param BlockIPList List of blocked IPs. The array can contain up to 200,000 entries in one operation.
     */
    public void setBlockIPList(String [] BlockIPList) {
        this.BlockIPList = BlockIPList;
    }

    /**
     * Get Expiration time in seconds. Default value: 3600 
     * @return ExpireTime Expiration time in seconds. Default value: 3600
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time in seconds. Default value: 3600
     * @param ExpireTime Expiration time in seconds. Default value: 3600
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get IP adding policy. Valid value: fifo (if a blacklist is full, new IPs added to the blacklist will adopt the first-in first-out policy) 
     * @return AddStrategy IP adding policy. Valid value: fifo (if a blacklist is full, new IPs added to the blacklist will adopt the first-in first-out policy)
     */
    public String getAddStrategy() {
        return this.AddStrategy;
    }

    /**
     * Set IP adding policy. Valid value: fifo (if a blacklist is full, new IPs added to the blacklist will adopt the first-in first-out policy)
     * @param AddStrategy IP adding policy. Valid value: fifo (if a blacklist is full, new IPs added to the blacklist will adopt the first-in first-out policy)
     */
    public void setAddStrategy(String AddStrategy) {
        this.AddStrategy = AddStrategy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClientIPField", this.ClientIPField);
        this.setParamArraySimple(map, prefix + "BlockIPList.", this.BlockIPList);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AddStrategy", this.AddStrategy);

    }
}

