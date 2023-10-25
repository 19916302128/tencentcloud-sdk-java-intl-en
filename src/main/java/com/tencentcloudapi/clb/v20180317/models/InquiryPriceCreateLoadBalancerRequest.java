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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateLoadBalancerRequest extends AbstractModel {

    /**
    * Network type of the CLB to query. `OPEN`: Public network; `INTERNAL`: Private network is intranet type
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * The billing mode to query. `POSTPAID`:Pay as you go
    */
    @SerializedName("LoadBalancerChargeType")
    @Expose
    private String LoadBalancerChargeType;

    /**
    * Reserved field
    */
    @SerializedName("LoadBalancerChargePrepaid")
    @Expose
    private LBChargePrepaid LoadBalancerChargePrepaid;

    /**
    * The network billing mode to query 
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Number of CLB instances to query. Default value: 1.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Availability zone in the format of "ap-guangzhou-1"
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * To query the price of monthly subscribed LCU-supported instances, specify the instance specification in this parameter, such as `clb.c3.small`. For PAYG instances, use `SLA`.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * IP version. Valid values: `IPV4` (default), `IPV6` (IPV6 NAT64 version) or `IPv6FullChain` (IPv6 version). 
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
     * Get Network type of the CLB to query. `OPEN`: Public network; `INTERNAL`: Private network is intranet type 
     * @return LoadBalancerType Network type of the CLB to query. `OPEN`: Public network; `INTERNAL`: Private network is intranet type
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Network type of the CLB to query. `OPEN`: Public network; `INTERNAL`: Private network is intranet type
     * @param LoadBalancerType Network type of the CLB to query. `OPEN`: Public network; `INTERNAL`: Private network is intranet type
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get The billing mode to query. `POSTPAID`:Pay as you go 
     * @return LoadBalancerChargeType The billing mode to query. `POSTPAID`:Pay as you go
     */
    public String getLoadBalancerChargeType() {
        return this.LoadBalancerChargeType;
    }

    /**
     * Set The billing mode to query. `POSTPAID`:Pay as you go
     * @param LoadBalancerChargeType The billing mode to query. `POSTPAID`:Pay as you go
     */
    public void setLoadBalancerChargeType(String LoadBalancerChargeType) {
        this.LoadBalancerChargeType = LoadBalancerChargeType;
    }

    /**
     * Get Reserved field 
     * @return LoadBalancerChargePrepaid Reserved field
     */
    public LBChargePrepaid getLoadBalancerChargePrepaid() {
        return this.LoadBalancerChargePrepaid;
    }

    /**
     * Set Reserved field
     * @param LoadBalancerChargePrepaid Reserved field
     */
    public void setLoadBalancerChargePrepaid(LBChargePrepaid LoadBalancerChargePrepaid) {
        this.LoadBalancerChargePrepaid = LoadBalancerChargePrepaid;
    }

    /**
     * Get The network billing mode to query  
     * @return InternetAccessible The network billing mode to query 
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set The network billing mode to query 
     * @param InternetAccessible The network billing mode to query 
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Number of CLB instances to query. Default value: 1. 
     * @return GoodsNum Number of CLB instances to query. Default value: 1.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of CLB instances to query. Default value: 1.
     * @param GoodsNum Number of CLB instances to query. Default value: 1.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Availability zone in the format of "ap-guangzhou-1" 
     * @return ZoneId Availability zone in the format of "ap-guangzhou-1"
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone in the format of "ap-guangzhou-1"
     * @param ZoneId Availability zone in the format of "ap-guangzhou-1"
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get To query the price of monthly subscribed LCU-supported instances, specify the instance specification in this parameter, such as `clb.c3.small`. For PAYG instances, use `SLA`. 
     * @return SlaType To query the price of monthly subscribed LCU-supported instances, specify the instance specification in this parameter, such as `clb.c3.small`. For PAYG instances, use `SLA`.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set To query the price of monthly subscribed LCU-supported instances, specify the instance specification in this parameter, such as `clb.c3.small`. For PAYG instances, use `SLA`.
     * @param SlaType To query the price of monthly subscribed LCU-supported instances, specify the instance specification in this parameter, such as `clb.c3.small`. For PAYG instances, use `SLA`.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get IP version. Valid values: `IPV4` (default), `IPV6` (IPV6 NAT64 version) or `IPv6FullChain` (IPv6 version).  
     * @return AddressIPVersion IP version. Valid values: `IPV4` (default), `IPV6` (IPV6 NAT64 version) or `IPv6FullChain` (IPv6 version). 
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version. Valid values: `IPV4` (default), `IPV6` (IPV6 NAT64 version) or `IPv6FullChain` (IPv6 version). 
     * @param AddressIPVersion IP version. Valid values: `IPV4` (default), `IPV6` (IPV6 NAT64 version) or `IPv6FullChain` (IPv6 version). 
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).  
     * @return VipIsp ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     * @param VipIsp ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    public InquiryPriceCreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateLoadBalancerRequest(InquiryPriceCreateLoadBalancerRequest source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerChargeType != null) {
            this.LoadBalancerChargeType = new String(source.LoadBalancerChargeType);
        }
        if (source.LoadBalancerChargePrepaid != null) {
            this.LoadBalancerChargePrepaid = new LBChargePrepaid(source.LoadBalancerChargePrepaid);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerChargeType", this.LoadBalancerChargeType);
        this.setParamObj(map, prefix + "LoadBalancerChargePrepaid.", this.LoadBalancerChargePrepaid);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);

    }
}

