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

public class EncryptRequest extends AbstractModel {

    /**
    * Globally unique ID of the CMK generated by calling the `CreateKey` API
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Encrypted plaintext data. This field must be Base64-encoded. The maximum size of the original data is 4 KB
    */
    @SerializedName("Plaintext")
    @Expose
    private String Plaintext;

    /**
    * JSON string of key-value pair. If this parameter is specified, the same parameter needs to be provided when the `Decrypt` API is called. It is up to 1,024 characters
    */
    @SerializedName("EncryptionContext")
    @Expose
    private String EncryptionContext;

    /**
     * Get Globally unique ID of the CMK generated by calling the `CreateKey` API 
     * @return KeyId Globally unique ID of the CMK generated by calling the `CreateKey` API
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique ID of the CMK generated by calling the `CreateKey` API
     * @param KeyId Globally unique ID of the CMK generated by calling the `CreateKey` API
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Encrypted plaintext data. This field must be Base64-encoded. The maximum size of the original data is 4 KB 
     * @return Plaintext Encrypted plaintext data. This field must be Base64-encoded. The maximum size of the original data is 4 KB
     */
    public String getPlaintext() {
        return this.Plaintext;
    }

    /**
     * Set Encrypted plaintext data. This field must be Base64-encoded. The maximum size of the original data is 4 KB
     * @param Plaintext Encrypted plaintext data. This field must be Base64-encoded. The maximum size of the original data is 4 KB
     */
    public void setPlaintext(String Plaintext) {
        this.Plaintext = Plaintext;
    }

    /**
     * Get JSON string of key-value pair. If this parameter is specified, the same parameter needs to be provided when the `Decrypt` API is called. It is up to 1,024 characters 
     * @return EncryptionContext JSON string of key-value pair. If this parameter is specified, the same parameter needs to be provided when the `Decrypt` API is called. It is up to 1,024 characters
     */
    public String getEncryptionContext() {
        return this.EncryptionContext;
    }

    /**
     * Set JSON string of key-value pair. If this parameter is specified, the same parameter needs to be provided when the `Decrypt` API is called. It is up to 1,024 characters
     * @param EncryptionContext JSON string of key-value pair. If this parameter is specified, the same parameter needs to be provided when the `Decrypt` API is called. It is up to 1,024 characters
     */
    public void setEncryptionContext(String EncryptionContext) {
        this.EncryptionContext = EncryptionContext;
    }

    public EncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptRequest(EncryptRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Plaintext != null) {
            this.Plaintext = new String(source.Plaintext);
        }
        if (source.EncryptionContext != null) {
            this.EncryptionContext = new String(source.EncryptionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Plaintext", this.Plaintext);
        this.setParamSimple(map, prefix + "EncryptionContext", this.EncryptionContext);

    }
}

