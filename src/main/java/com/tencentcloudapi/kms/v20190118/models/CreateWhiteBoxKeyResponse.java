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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhiteBoxKeyResponse extends AbstractModel{

    /**
    * Base64-encoded encryption key
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * Base64-encoded decryption key
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * Globally unique white-box key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Base64-encoded encryption key 
     * @return EncryptKey Base64-encoded encryption key
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set Base64-encoded encryption key
     * @param EncryptKey Base64-encoded encryption key
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get Base64-encoded decryption key 
     * @return DecryptKey Base64-encoded decryption key
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set Base64-encoded decryption key
     * @param DecryptKey Base64-encoded decryption key
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get Globally unique white-box key ID 
     * @return KeyId Globally unique white-box key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique white-box key ID
     * @param KeyId Globally unique white-box key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

