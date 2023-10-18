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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateComputeEnvRequest extends AbstractModel {

    /**
    * Compute environment information
    */
    @SerializedName("ComputeEnv")
    @Expose
    private NamedComputeEnv ComputeEnv;

    /**
    * Location information
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * The string used to guarantee the idempotency of the request, which is generated by the user and must be unique for different requests. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get Compute environment information 
     * @return ComputeEnv Compute environment information
     */
    public NamedComputeEnv getComputeEnv() {
        return this.ComputeEnv;
    }

    /**
     * Set Compute environment information
     * @param ComputeEnv Compute environment information
     */
    public void setComputeEnv(NamedComputeEnv ComputeEnv) {
        this.ComputeEnv = ComputeEnv;
    }

    /**
     * Get Location information 
     * @return Placement Location information
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location information
     * @param Placement Location information
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get The string used to guarantee the idempotency of the request, which is generated by the user and must be unique for different requests. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. 
     * @return ClientToken The string used to guarantee the idempotency of the request, which is generated by the user and must be unique for different requests. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set The string used to guarantee the idempotency of the request, which is generated by the user and must be unique for different requests. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     * @param ClientToken The string used to guarantee the idempotency of the request, which is generated by the user and must be unique for different requests. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateComputeEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComputeEnvRequest(CreateComputeEnvRequest source) {
        if (source.ComputeEnv != null) {
            this.ComputeEnv = new NamedComputeEnv(source.ComputeEnv);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ComputeEnv.", this.ComputeEnv);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

