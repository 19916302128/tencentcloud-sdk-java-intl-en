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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeNode extends AbstractModel{

    /**
    * Compute node ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;

    /**
    * Compute node instance ID. In a CVM scenario, this parameter is the CVM InstanceId
    */
    @SerializedName("ComputeNodeInstanceId")
    @Expose
    private String ComputeNodeInstanceId;

    /**
    * Compute node state
    */
    @SerializedName("ComputeNodeState")
    @Expose
    private String ComputeNodeState;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in GiB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Resource creation time
    */
    @SerializedName("ResourceCreatedTime")
    @Expose
    private String ResourceCreatedTime;

    /**
    * Available capacity of the compute node when running TaskInstance. 0 means that the compute node is busy.
    */
    @SerializedName("TaskInstanceNumAvailable")
    @Expose
    private Long TaskInstanceNumAvailable;

    /**
    * BatchCompute Agent version
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * Private IP of the instance
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Public IP of the instance
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
     * Get Compute node ID 
     * @return ComputeNodeId Compute node ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * Set Compute node ID
     * @param ComputeNodeId Compute node ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * Get Compute node instance ID. In a CVM scenario, this parameter is the CVM InstanceId 
     * @return ComputeNodeInstanceId Compute node instance ID. In a CVM scenario, this parameter is the CVM InstanceId
     */
    public String getComputeNodeInstanceId() {
        return this.ComputeNodeInstanceId;
    }

    /**
     * Set Compute node instance ID. In a CVM scenario, this parameter is the CVM InstanceId
     * @param ComputeNodeInstanceId Compute node instance ID. In a CVM scenario, this parameter is the CVM InstanceId
     */
    public void setComputeNodeInstanceId(String ComputeNodeInstanceId) {
        this.ComputeNodeInstanceId = ComputeNodeInstanceId;
    }

    /**
     * Get Compute node state 
     * @return ComputeNodeState Compute node state
     */
    public String getComputeNodeState() {
        return this.ComputeNodeState;
    }

    /**
     * Set Compute node state
     * @param ComputeNodeState Compute node state
     */
    public void setComputeNodeState(String ComputeNodeState) {
        this.ComputeNodeState = ComputeNodeState;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in GiB 
     * @return Mem Memory size in GiB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory size in GiB
     * @param Mem Memory size in GiB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Resource creation time 
     * @return ResourceCreatedTime Resource creation time
     */
    public String getResourceCreatedTime() {
        return this.ResourceCreatedTime;
    }

    /**
     * Set Resource creation time
     * @param ResourceCreatedTime Resource creation time
     */
    public void setResourceCreatedTime(String ResourceCreatedTime) {
        this.ResourceCreatedTime = ResourceCreatedTime;
    }

    /**
     * Get Available capacity of the compute node when running TaskInstance. 0 means that the compute node is busy. 
     * @return TaskInstanceNumAvailable Available capacity of the compute node when running TaskInstance. 0 means that the compute node is busy.
     */
    public Long getTaskInstanceNumAvailable() {
        return this.TaskInstanceNumAvailable;
    }

    /**
     * Set Available capacity of the compute node when running TaskInstance. 0 means that the compute node is busy.
     * @param TaskInstanceNumAvailable Available capacity of the compute node when running TaskInstance. 0 means that the compute node is busy.
     */
    public void setTaskInstanceNumAvailable(Long TaskInstanceNumAvailable) {
        this.TaskInstanceNumAvailable = TaskInstanceNumAvailable;
    }

    /**
     * Get BatchCompute Agent version 
     * @return AgentVersion BatchCompute Agent version
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set BatchCompute Agent version
     * @param AgentVersion BatchCompute Agent version
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get Private IP of the instance 
     * @return PrivateIpAddresses Private IP of the instance
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Private IP of the instance
     * @param PrivateIpAddresses Private IP of the instance
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Public IP of the instance 
     * @return PublicIpAddresses Public IP of the instance
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public IP of the instance
     * @param PublicIpAddresses Public IP of the instance
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeInstanceId", this.ComputeNodeInstanceId);
        this.setParamSimple(map, prefix + "ComputeNodeState", this.ComputeNodeState);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ResourceCreatedTime", this.ResourceCreatedTime);
        this.setParamSimple(map, prefix + "TaskInstanceNumAvailable", this.TaskInstanceNumAvailable);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);

    }
}

