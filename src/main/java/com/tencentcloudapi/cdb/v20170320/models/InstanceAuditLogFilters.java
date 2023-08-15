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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditLogFilters extends AbstractModel{

    /**
    * Filter condition, which is not supported for `SQL`. The search conditions are supported as follows:

`Equal to`, `Not equal to`, `Include`, and `Exclude` can be used to search for 
`host` (Client IP),
`user` (Username),
and `DBName` (Database name).

`Equal to` and `Not equal to` can be used to search for 
`sqlType`- SQL u200dtype,
`errCode` - Error code,
`threadId`- Thread ID.

Range search is supported for the fields, such as 
`execTime`- Execution time (μs),
`lockWaitTime`u200d - Lock wait time (μs),
`ioWaitTime` - IO wait time (μs),
`trxLivingTime` - Transaction duration (μs),
`cpuTime` - CPU time (μs),
`checkRows` - Number of scanned rows,
`affectRows` - Number of affected rows,
`sentRows` - Number of returned rows.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter, including:
`INC` - Include,
`EXC` -Exclude,
`EQS` - Equal to,
`NEQ` - Not equal to.
u200d`RA` - Range
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * The filter value
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Filter condition, which is not supported for `SQL`. The search conditions are supported as follows:

`Equal to`, `Not equal to`, `Include`, and `Exclude` can be used to search for 
`host` (Client IP),
`user` (Username),
and `DBName` (Database name).

`Equal to` and `Not equal to` can be used to search for 
`sqlType`- SQL u200dtype,
`errCode` - Error code,
`threadId`- Thread ID.

Range search is supported for the fields, such as 
`execTime`- Execution time (μs),
`lockWaitTime`u200d - Lock wait time (μs),
`ioWaitTime` - IO wait time (μs),
`trxLivingTime` - Transaction duration (μs),
`cpuTime` - CPU time (μs),
`checkRows` - Number of scanned rows,
`affectRows` - Number of affected rows,
`sentRows` - Number of returned rows. 
     * @return Type Filter condition, which is not supported for `SQL`. The search conditions are supported as follows:

`Equal to`, `Not equal to`, `Include`, and `Exclude` can be used to search for 
`host` (Client IP),
`user` (Username),
and `DBName` (Database name).

`Equal to` and `Not equal to` can be used to search for 
`sqlType`- SQL u200dtype,
`errCode` - Error code,
`threadId`- Thread ID.

Range search is supported for the fields, such as 
`execTime`- Execution time (μs),
`lockWaitTime`u200d - Lock wait time (μs),
`ioWaitTime` - IO wait time (μs),
`trxLivingTime` - Transaction duration (μs),
`cpuTime` - CPU time (μs),
`checkRows` - Number of scanned rows,
`affectRows` - Number of affected rows,
`sentRows` - Number of returned rows.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filter condition, which is not supported for `SQL`. The search conditions are supported as follows:

`Equal to`, `Not equal to`, `Include`, and `Exclude` can be used to search for 
`host` (Client IP),
`user` (Username),
and `DBName` (Database name).

`Equal to` and `Not equal to` can be used to search for 
`sqlType`- SQL u200dtype,
`errCode` - Error code,
`threadId`- Thread ID.

Range search is supported for the fields, such as 
`execTime`- Execution time (μs),
`lockWaitTime`u200d - Lock wait time (μs),
`ioWaitTime` - IO wait time (μs),
`trxLivingTime` - Transaction duration (μs),
`cpuTime` - CPU time (μs),
`checkRows` - Number of scanned rows,
`affectRows` - Number of affected rows,
`sentRows` - Number of returned rows.
     * @param Type Filter condition, which is not supported for `SQL`. The search conditions are supported as follows:

`Equal to`, `Not equal to`, `Include`, and `Exclude` can be used to search for 
`host` (Client IP),
`user` (Username),
and `DBName` (Database name).

`Equal to` and `Not equal to` can be used to search for 
`sqlType`- SQL u200dtype,
`errCode` - Error code,
`threadId`- Thread ID.

Range search is supported for the fields, such as 
`execTime`- Execution time (μs),
`lockWaitTime`u200d - Lock wait time (μs),
`ioWaitTime` - IO wait time (μs),
`trxLivingTime` - Transaction duration (μs),
`cpuTime` - CPU time (μs),
`checkRows` - Number of scanned rows,
`affectRows` - Number of affected rows,
`sentRows` - Number of returned rows.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter, including:
`INC` - Include,
`EXC` -Exclude,
`EQS` - Equal to,
`NEQ` - Not equal to.
u200d`RA` - Range 
     * @return Compare Filter, including:
`INC` - Include,
`EXC` -Exclude,
`EQS` - Equal to,
`NEQ` - Not equal to.
u200d`RA` - Range
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Filter, including:
`INC` - Include,
`EXC` -Exclude,
`EQS` - Equal to,
`NEQ` - Not equal to.
u200d`RA` - Range
     * @param Compare Filter, including:
`INC` - Include,
`EXC` -Exclude,
`EQS` - Equal to,
`NEQ` - Not equal to.
u200d`RA` - Range
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get The filter value 
     * @return Value The filter value
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set The filter value
     * @param Value The filter value
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public InstanceAuditLogFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditLogFilters(InstanceAuditLogFilters source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}
