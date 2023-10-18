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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortInfo extends AbstractModel {

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Server port
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * Container port
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * Container PID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Monitored address in the container
    */
    @SerializedName("ListenContainer")
    @Expose
    private String ListenContainer;

    /**
    * Monitored address outside the container
    */
    @SerializedName("ListenHost")
    @Expose
    private String ListenHost;

    /**
    * Operating account
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
     * Get Type 
     * @return Type Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Public IP 
     * @return PublicIP Public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP
     * @param PublicIP Public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Server port 
     * @return PublicPort Server port
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set Server port
     * @param PublicPort Server port
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get Container port 
     * @return ContainerPort Container port
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set Container port
     * @param ContainerPort Container port
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get Container PID 
     * @return ContainerPID Container PID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set Container PID
     * @param ContainerPID Container PID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Server IP 
     * @return HostIP Server IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
     * @param HostIP Server IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Monitored address in the container 
     * @return ListenContainer Monitored address in the container
     */
    public String getListenContainer() {
        return this.ListenContainer;
    }

    /**
     * Set Monitored address in the container
     * @param ListenContainer Monitored address in the container
     */
    public void setListenContainer(String ListenContainer) {
        this.ListenContainer = ListenContainer;
    }

    /**
     * Get Monitored address outside the container 
     * @return ListenHost Monitored address outside the container
     */
    public String getListenHost() {
        return this.ListenHost;
    }

    /**
     * Set Monitored address outside the container
     * @param ListenHost Monitored address outside the container
     */
    public void setListenHost(String ListenHost) {
        this.ListenHost = ListenHost;
    }

    /**
     * Get Operating account 
     * @return RunAs Operating account
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Operating account
     * @param RunAs Operating account
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    public PortInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortInfo(PortInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ListenContainer != null) {
            this.ListenContainer = new String(source.ListenContainer);
        }
        if (source.ListenHost != null) {
            this.ListenHost = new String(source.ListenHost);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ListenContainer", this.ListenContainer);
        this.setParamSimple(map, prefix + "ListenHost", this.ListenHost);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);

    }
}

