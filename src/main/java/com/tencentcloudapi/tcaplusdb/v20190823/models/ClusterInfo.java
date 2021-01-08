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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel{

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * Network type
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * ID of the VPC instance with which a cluster is associated
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet instance with which a cluster is associated
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Cluster password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Password status
    */
    @SerializedName("PasswordStatus")
    @Expose
    private String PasswordStatus;

    /**
    * TcaplusDB SDK connection parameter: access ID
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * TcaplusDB SDK connection parameter: access address
    */
    @SerializedName("ApiAccessIp")
    @Expose
    private String ApiAccessIp;

    /**
    * TcaplusDB SDK connection parameter: access port
    */
    @SerializedName("ApiAccessPort")
    @Expose
    private Long ApiAccessPort;

    /**
    * If `PasswordStatus` is `unmodifiable`, the old password has not expired, and this field will display its expiration time; otherwise, this field will be empty
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * TcaplusDB SDK connection parameter for accessing IPv6 addresses
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiAccessIpv6")
    @Expose
    private String ApiAccessIpv6;

    /**
    * Cluster type
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Cluster status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * Read CU
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadCapacityUnit")
    @Expose
    private Long ReadCapacityUnit;

    /**
    * Write CU
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WriteCapacityUnit")
    @Expose
    private Long WriteCapacityUnit;

    /**
    * Disk capacity
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskVolume")
    @Expose
    private Long DiskVolume;

    /**
    * Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerList")
    @Expose
    private ServerDetailInfo [] ServerList;

    /**
    * Information of the machine at the access layer (tcaproxy) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyDetailInfo [] ProxyList;

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Cluster data description language type, such as `PROTO`, `TDR`, or `MIX` 
     * @return IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     * @param IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get Network type 
     * @return NetworkType Network type
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type
     * @param NetworkType Network type
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get ID of the VPC instance with which a cluster is associated 
     * @return VpcId ID of the VPC instance with which a cluster is associated
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance with which a cluster is associated
     * @param VpcId ID of the VPC instance with which a cluster is associated
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet instance with which a cluster is associated 
     * @return SubnetId ID of the subnet instance with which a cluster is associated
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet instance with which a cluster is associated
     * @param SubnetId ID of the subnet instance with which a cluster is associated
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Cluster password 
     * @return Password Cluster password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster password
     * @param Password Cluster password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Password status 
     * @return PasswordStatus Password status
     */
    public String getPasswordStatus() {
        return this.PasswordStatus;
    }

    /**
     * Set Password status
     * @param PasswordStatus Password status
     */
    public void setPasswordStatus(String PasswordStatus) {
        this.PasswordStatus = PasswordStatus;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access ID 
     * @return ApiAccessId TcaplusDB SDK connection parameter: access ID
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access ID
     * @param ApiAccessId TcaplusDB SDK connection parameter: access ID
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access address 
     * @return ApiAccessIp TcaplusDB SDK connection parameter: access address
     */
    public String getApiAccessIp() {
        return this.ApiAccessIp;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access address
     * @param ApiAccessIp TcaplusDB SDK connection parameter: access address
     */
    public void setApiAccessIp(String ApiAccessIp) {
        this.ApiAccessIp = ApiAccessIp;
    }

    /**
     * Get TcaplusDB SDK connection parameter: access port 
     * @return ApiAccessPort TcaplusDB SDK connection parameter: access port
     */
    public Long getApiAccessPort() {
        return this.ApiAccessPort;
    }

    /**
     * Set TcaplusDB SDK connection parameter: access port
     * @param ApiAccessPort TcaplusDB SDK connection parameter: access port
     */
    public void setApiAccessPort(Long ApiAccessPort) {
        this.ApiAccessPort = ApiAccessPort;
    }

    /**
     * Get If `PasswordStatus` is `unmodifiable`, the old password has not expired, and this field will display its expiration time; otherwise, this field will be empty
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OldPasswordExpireTime If `PasswordStatus` is `unmodifiable`, the old password has not expired, and this field will display its expiration time; otherwise, this field will be empty
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * Set If `PasswordStatus` is `unmodifiable`, the old password has not expired, and this field will display its expiration time; otherwise, this field will be empty
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OldPasswordExpireTime If `PasswordStatus` is `unmodifiable`, the old password has not expired, and this field will display its expiration time; otherwise, this field will be empty
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * Get TcaplusDB SDK connection parameter for accessing IPv6 addresses
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiAccessIpv6 TcaplusDB SDK connection parameter for accessing IPv6 addresses
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiAccessIpv6() {
        return this.ApiAccessIpv6;
    }

    /**
     * Set TcaplusDB SDK connection parameter for accessing IPv6 addresses
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiAccessIpv6 TcaplusDB SDK connection parameter for accessing IPv6 addresses
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiAccessIpv6(String ApiAccessIpv6) {
        this.ApiAccessIpv6 = ApiAccessIpv6;
    }

    /**
     * Get Cluster type
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterType Cluster type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterType Cluster type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterStatus Cluster status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterStatus Cluster status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Read CU
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReadCapacityUnit Read CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getReadCapacityUnit() {
        return this.ReadCapacityUnit;
    }

    /**
     * Set Read CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReadCapacityUnit Read CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReadCapacityUnit(Long ReadCapacityUnit) {
        this.ReadCapacityUnit = ReadCapacityUnit;
    }

    /**
     * Get Write CU
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WriteCapacityUnit Write CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getWriteCapacityUnit() {
        return this.WriteCapacityUnit;
    }

    /**
     * Set Write CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WriteCapacityUnit Write CU
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWriteCapacityUnit(Long WriteCapacityUnit) {
        this.WriteCapacityUnit = WriteCapacityUnit;
    }

    /**
     * Get Disk capacity
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DiskVolume Disk capacity
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDiskVolume() {
        return this.DiskVolume;
    }

    /**
     * Set Disk capacity
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DiskVolume Disk capacity
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiskVolume(Long DiskVolume) {
        this.DiskVolume = DiskVolume;
    }

    /**
     * Get Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ServerList Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ServerDetailInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ServerList Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServerList(ServerDetailInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get Information of the machine at the access layer (tcaproxy) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ProxyList Information of the machine at the access layer (tcaproxy) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ProxyDetailInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set Information of the machine at the access layer (tcaproxy) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ProxyList Information of the machine at the access layer (tcaproxy) in a dedicated cluster
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProxyList(ProxyDetailInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordStatus", this.PasswordStatus);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "ApiAccessIp", this.ApiAccessIp);
        this.setParamSimple(map, prefix + "ApiAccessPort", this.ApiAccessPort);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "ApiAccessIpv6", this.ApiAccessIpv6);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ReadCapacityUnit", this.ReadCapacityUnit);
        this.setParamSimple(map, prefix + "WriteCapacityUnit", this.WriteCapacityUnit);
        this.setParamSimple(map, prefix + "DiskVolume", this.DiskVolume);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);

    }
}

