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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVodDomainConfigRequest extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/14046?from_cn_redirect=1) policy
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/14047?from_cn_redirect=1) policy
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/14046?from_cn_redirect=1) policy 
     * @return RefererAuthPolicy [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/14046?from_cn_redirect=1) policy
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/14046?from_cn_redirect=1) policy
     * @param RefererAuthPolicy [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/14046?from_cn_redirect=1) policy
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/14047?from_cn_redirect=1) policy 
     * @return UrlSignatureAuthPolicy [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/14047?from_cn_redirect=1) policy
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/14047?from_cn_redirect=1) policy
     * @param UrlSignatureAuthPolicy [Key hotlink protection](https://intl.cloud.tencent.com/document/product/266/14047?from_cn_redirect=1) policy
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty. 
     * @return SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     * @param SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ModifyVodDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVodDomainConfigRequest(ModifyVodDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RefererAuthPolicy != null) {
            this.RefererAuthPolicy = new RefererAuthPolicy(source.RefererAuthPolicy);
        }
        if (source.UrlSignatureAuthPolicy != null) {
            this.UrlSignatureAuthPolicy = new UrlSignatureAuthPolicy(source.UrlSignatureAuthPolicy);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "RefererAuthPolicy.", this.RefererAuthPolicy);
        this.setParamObj(map, prefix + "UrlSignatureAuthPolicy.", this.UrlSignatureAuthPolicy);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}
