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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveEnterpriseSecurityGroupRuleResponse extends AbstractModel {

    /**
    * Returns the UUID of the deleted policy after the deletion is successful
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returns the UUID of the deleted policy after the deletion is successful 
     * @return RuleUuid Returns the UUID of the deleted policy after the deletion is successful
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set Returns the UUID of the deleted policy after the deletion is successful
     * @param RuleUuid Returns the UUID of the deleted policy after the deletion is successful
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Status 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     * @param Status 0: operation successful; -1: operation failed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public RemoveEnterpriseSecurityGroupRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveEnterpriseSecurityGroupRuleResponse(RemoveEnterpriseSecurityGroupRuleResponse source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

