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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPublicKeyResponse extends AbstractModel {

    /**
    * Unique CMK ID.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Base64-encoded public key content.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Public key content in PEM format.
    */
    @SerializedName("PublicKeyPem")
    @Expose
    private String PublicKeyPem;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique CMK ID. 
     * @return KeyId Unique CMK ID.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique CMK ID.
     * @param KeyId Unique CMK ID.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Base64-encoded public key content. 
     * @return PublicKey Base64-encoded public key content.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Base64-encoded public key content.
     * @param PublicKey Base64-encoded public key content.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Public key content in PEM format. 
     * @return PublicKeyPem Public key content in PEM format.
     */
    public String getPublicKeyPem() {
        return this.PublicKeyPem;
    }

    /**
     * Set Public key content in PEM format.
     * @param PublicKeyPem Public key content in PEM format.
     */
    public void setPublicKeyPem(String PublicKeyPem) {
        this.PublicKeyPem = PublicKeyPem;
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

    public GetPublicKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPublicKeyResponse(GetPublicKeyResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.PublicKeyPem != null) {
            this.PublicKeyPem = new String(source.PublicKeyPem);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PublicKeyPem", this.PublicKeyPem);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

