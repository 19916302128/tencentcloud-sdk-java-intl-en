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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosProtectionConfig extends AbstractModel {

    /**
    * Exclusive DDoS protection specifications in the Chinese mainland. For details, see [Dedicated DDoS Mitigation Fee (Pay-as-You-Go)] (https://intl.cloud.tencent.com/document/product/1552/94162?from_cn_redirect=1).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li>
<li>BASE30_MAX300: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 30 Gbps and an elastic protection bandwidth of up to 300 Gbps;</li><li>BASE60_MAX600: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 60 Gbps and an elastic protection bandwidth of up to 600 Gbps.</li>If no parameters are filled, the default value PLATFORM is used.
    */
    @SerializedName("LevelMainland")
    @Expose
    private String LevelMainland;

    /**
    * Configuration of elastic protection bandwidth for exclusive DDoS protection in the Chinese mainland.Valid only when exclusive DDoS protection in the Chinese mainland is enabled (refer to the LevelMainland parameter configuration), and the value has the following limitations:<li>When exclusive DDoS protection is enabled in the Chinese mainland and the 30 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE30_MAX300): the value range is 30 to 300 in Gbps;</li><li>When exclusive DDoS protection is enabled in the Chinese mainland and the 60 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE60_MAX600): the value range is 60 to 600 in Gbps;</li><li>When the default protection of the platform is used (the LevelMainland parameter value is PLATFORM): configuration is not supported, and the value of this parameter is invalid.</li>
    */
    @SerializedName("MaxBandwidthMainland")
    @Expose
    private Long MaxBandwidthMainland;

    /**
    * Exclusive DDoS protection specifications in the worldwide region (excluding the Chinese mainland).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li><li>ANYCAST300: Exclusive DDoS protection enabled, offering a total maximum protection bandwidth of 300 Gbps;</li>
<li>ANYCAST_ALLIN: Exclusive DDoS protection enabled, utilizing all available protection resources for protection.</li>When no parameters are filled, the default value PLATFORM is used.
    */
    @SerializedName("LevelOverseas")
    @Expose
    private String LevelOverseas;

    /**
     * Get Exclusive DDoS protection specifications in the Chinese mainland. For details, see [Dedicated DDoS Mitigation Fee (Pay-as-You-Go)] (https://intl.cloud.tencent.com/document/product/1552/94162?from_cn_redirect=1).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li>
<li>BASE30_MAX300: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 30 Gbps and an elastic protection bandwidth of up to 300 Gbps;</li><li>BASE60_MAX600: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 60 Gbps and an elastic protection bandwidth of up to 600 Gbps.</li>If no parameters are filled, the default value PLATFORM is used. 
     * @return LevelMainland Exclusive DDoS protection specifications in the Chinese mainland. For details, see [Dedicated DDoS Mitigation Fee (Pay-as-You-Go)] (https://intl.cloud.tencent.com/document/product/1552/94162?from_cn_redirect=1).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li>
<li>BASE30_MAX300: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 30 Gbps and an elastic protection bandwidth of up to 300 Gbps;</li><li>BASE60_MAX600: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 60 Gbps and an elastic protection bandwidth of up to 600 Gbps.</li>If no parameters are filled, the default value PLATFORM is used.
     */
    public String getLevelMainland() {
        return this.LevelMainland;
    }

    /**
     * Set Exclusive DDoS protection specifications in the Chinese mainland. For details, see [Dedicated DDoS Mitigation Fee (Pay-as-You-Go)] (https://intl.cloud.tencent.com/document/product/1552/94162?from_cn_redirect=1).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li>
<li>BASE30_MAX300: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 30 Gbps and an elastic protection bandwidth of up to 300 Gbps;</li><li>BASE60_MAX600: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 60 Gbps and an elastic protection bandwidth of up to 600 Gbps.</li>If no parameters are filled, the default value PLATFORM is used.
     * @param LevelMainland Exclusive DDoS protection specifications in the Chinese mainland. For details, see [Dedicated DDoS Mitigation Fee (Pay-as-You-Go)] (https://intl.cloud.tencent.com/document/product/1552/94162?from_cn_redirect=1).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li>
<li>BASE30_MAX300: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 30 Gbps and an elastic protection bandwidth of up to 300 Gbps;</li><li>BASE60_MAX600: Exclusive DDoS protection enabled, providing a baseline protection bandwidth of 60 Gbps and an elastic protection bandwidth of up to 600 Gbps.</li>If no parameters are filled, the default value PLATFORM is used.
     */
    public void setLevelMainland(String LevelMainland) {
        this.LevelMainland = LevelMainland;
    }

    /**
     * Get Configuration of elastic protection bandwidth for exclusive DDoS protection in the Chinese mainland.Valid only when exclusive DDoS protection in the Chinese mainland is enabled (refer to the LevelMainland parameter configuration), and the value has the following limitations:<li>When exclusive DDoS protection is enabled in the Chinese mainland and the 30 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE30_MAX300): the value range is 30 to 300 in Gbps;</li><li>When exclusive DDoS protection is enabled in the Chinese mainland and the 60 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE60_MAX600): the value range is 60 to 600 in Gbps;</li><li>When the default protection of the platform is used (the LevelMainland parameter value is PLATFORM): configuration is not supported, and the value of this parameter is invalid.</li> 
     * @return MaxBandwidthMainland Configuration of elastic protection bandwidth for exclusive DDoS protection in the Chinese mainland.Valid only when exclusive DDoS protection in the Chinese mainland is enabled (refer to the LevelMainland parameter configuration), and the value has the following limitations:<li>When exclusive DDoS protection is enabled in the Chinese mainland and the 30 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE30_MAX300): the value range is 30 to 300 in Gbps;</li><li>When exclusive DDoS protection is enabled in the Chinese mainland and the 60 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE60_MAX600): the value range is 60 to 600 in Gbps;</li><li>When the default protection of the platform is used (the LevelMainland parameter value is PLATFORM): configuration is not supported, and the value of this parameter is invalid.</li>
     */
    public Long getMaxBandwidthMainland() {
        return this.MaxBandwidthMainland;
    }

    /**
     * Set Configuration of elastic protection bandwidth for exclusive DDoS protection in the Chinese mainland.Valid only when exclusive DDoS protection in the Chinese mainland is enabled (refer to the LevelMainland parameter configuration), and the value has the following limitations:<li>When exclusive DDoS protection is enabled in the Chinese mainland and the 30 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE30_MAX300): the value range is 30 to 300 in Gbps;</li><li>When exclusive DDoS protection is enabled in the Chinese mainland and the 60 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE60_MAX600): the value range is 60 to 600 in Gbps;</li><li>When the default protection of the platform is used (the LevelMainland parameter value is PLATFORM): configuration is not supported, and the value of this parameter is invalid.</li>
     * @param MaxBandwidthMainland Configuration of elastic protection bandwidth for exclusive DDoS protection in the Chinese mainland.Valid only when exclusive DDoS protection in the Chinese mainland is enabled (refer to the LevelMainland parameter configuration), and the value has the following limitations:<li>When exclusive DDoS protection is enabled in the Chinese mainland and the 30 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE30_MAX300): the value range is 30 to 300 in Gbps;</li><li>When exclusive DDoS protection is enabled in the Chinese mainland and the 60 Gbps baseline protection bandwidth is used (the LevelMainland parameter value is BASE60_MAX600): the value range is 60 to 600 in Gbps;</li><li>When the default protection of the platform is used (the LevelMainland parameter value is PLATFORM): configuration is not supported, and the value of this parameter is invalid.</li>
     */
    public void setMaxBandwidthMainland(Long MaxBandwidthMainland) {
        this.MaxBandwidthMainland = MaxBandwidthMainland;
    }

    /**
     * Get Exclusive DDoS protection specifications in the worldwide region (excluding the Chinese mainland).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li><li>ANYCAST300: Exclusive DDoS protection enabled, offering a total maximum protection bandwidth of 300 Gbps;</li>
<li>ANYCAST_ALLIN: Exclusive DDoS protection enabled, utilizing all available protection resources for protection.</li>When no parameters are filled, the default value PLATFORM is used. 
     * @return LevelOverseas Exclusive DDoS protection specifications in the worldwide region (excluding the Chinese mainland).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li><li>ANYCAST300: Exclusive DDoS protection enabled, offering a total maximum protection bandwidth of 300 Gbps;</li>
<li>ANYCAST_ALLIN: Exclusive DDoS protection enabled, utilizing all available protection resources for protection.</li>When no parameters are filled, the default value PLATFORM is used.
     */
    public String getLevelOverseas() {
        return this.LevelOverseas;
    }

    /**
     * Set Exclusive DDoS protection specifications in the worldwide region (excluding the Chinese mainland).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li><li>ANYCAST300: Exclusive DDoS protection enabled, offering a total maximum protection bandwidth of 300 Gbps;</li>
<li>ANYCAST_ALLIN: Exclusive DDoS protection enabled, utilizing all available protection resources for protection.</li>When no parameters are filled, the default value PLATFORM is used.
     * @param LevelOverseas Exclusive DDoS protection specifications in the worldwide region (excluding the Chinese mainland).<li>PLATFORM: Default protection of the platform, i.e., Exclusive DDoS protection is not enabled;</li><li>ANYCAST300: Exclusive DDoS protection enabled, offering a total maximum protection bandwidth of 300 Gbps;</li>
<li>ANYCAST_ALLIN: Exclusive DDoS protection enabled, utilizing all available protection resources for protection.</li>When no parameters are filled, the default value PLATFORM is used.
     */
    public void setLevelOverseas(String LevelOverseas) {
        this.LevelOverseas = LevelOverseas;
    }

    public DDosProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosProtectionConfig(DDosProtectionConfig source) {
        if (source.LevelMainland != null) {
            this.LevelMainland = new String(source.LevelMainland);
        }
        if (source.MaxBandwidthMainland != null) {
            this.MaxBandwidthMainland = new Long(source.MaxBandwidthMainland);
        }
        if (source.LevelOverseas != null) {
            this.LevelOverseas = new String(source.LevelOverseas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelMainland", this.LevelMainland);
        this.setParamSimple(map, prefix + "MaxBandwidthMainland", this.MaxBandwidthMainland);
        this.setParamSimple(map, prefix + "LevelOverseas", this.LevelOverseas);

    }
}

