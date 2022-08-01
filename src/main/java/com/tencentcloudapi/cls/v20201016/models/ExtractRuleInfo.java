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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractRuleInfo extends AbstractModel{

    /**
    * Time field key name. `time_key` and `time_format` must appear in pairs
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Delimiter for delimited log, which is valid only if `log_type` is `delimiter_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * Full log matching rule, which is valid only if `log_type` is `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * First-Line matching rule, which is valid only if `log_type` is `multiline_log` or `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginRegex")
    @Expose
    private String BeginRegex;

    /**
    * Key name of each extracted field. An empty key indicates to discard the field. This parameter is valid only if `log_type` is `delimiter_log`. `json_log` logs use the key of JSON itself
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * Log keys to be filtered and the corresponding regex
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterKeyRegex")
    @Expose
    private KeyRegexInfo [] FilterKeyRegex;

    /**
    * Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchUpLoadSwitch")
    @Expose
    private Boolean UnMatchUpLoadSwitch;

    /**
    * Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * Size of the data to be rewound in incremental collection mode. Default value: -1 (full collection)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Backtracking")
    @Expose
    private Long Backtracking;

    /**
    * Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsGBK")
    @Expose
    private Long IsGBK;

    /**
    * Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonStandard")
    @Expose
    private Long JsonStandard;

    /**
     * Get Time field key name. `time_key` and `time_format` must appear in pairs
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimeKey Time field key name. `time_key` and `time_format` must appear in pairs
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time field key name. `time_key` and `time_format` must appear in pairs
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimeKey Time field key name. `time_key` and `time_format` must appear in pairs
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimeFormat Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimeFormat Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Delimiter for delimited log, which is valid only if `log_type` is `delimiter_log`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Delimiter Delimiter for delimited log, which is valid only if `log_type` is `delimiter_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Delimiter for delimited log, which is valid only if `log_type` is `delimiter_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Delimiter Delimiter for delimited log, which is valid only if `log_type` is `delimiter_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get Full log matching rule, which is valid only if `log_type` is `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LogRegex Full log matching rule, which is valid only if `log_type` is `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set Full log matching rule, which is valid only if `log_type` is `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LogRegex Full log matching rule, which is valid only if `log_type` is `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get First-Line matching rule, which is valid only if `log_type` is `multiline_log` or `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BeginRegex First-Line matching rule, which is valid only if `log_type` is `multiline_log` or `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBeginRegex() {
        return this.BeginRegex;
    }

    /**
     * Set First-Line matching rule, which is valid only if `log_type` is `multiline_log` or `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BeginRegex First-Line matching rule, which is valid only if `log_type` is `multiline_log` or `fullregex_log`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBeginRegex(String BeginRegex) {
        this.BeginRegex = BeginRegex;
    }

    /**
     * Get Key name of each extracted field. An empty key indicates to discard the field. This parameter is valid only if `log_type` is `delimiter_log`. `json_log` logs use the key of JSON itself
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Keys Key name of each extracted field. An empty key indicates to discard the field. This parameter is valid only if `log_type` is `delimiter_log`. `json_log` logs use the key of JSON itself
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Key name of each extracted field. An empty key indicates to discard the field. This parameter is valid only if `log_type` is `delimiter_log`. `json_log` logs use the key of JSON itself
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Keys Key name of each extracted field. An empty key indicates to discard the field. This parameter is valid only if `log_type` is `delimiter_log`. `json_log` logs use the key of JSON itself
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Log keys to be filtered and the corresponding regex
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FilterKeyRegex Log keys to be filtered and the corresponding regex
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public KeyRegexInfo [] getFilterKeyRegex() {
        return this.FilterKeyRegex;
    }

    /**
     * Set Log keys to be filtered and the corresponding regex
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FilterKeyRegex Log keys to be filtered and the corresponding regex
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFilterKeyRegex(KeyRegexInfo [] FilterKeyRegex) {
        this.FilterKeyRegex = FilterKeyRegex;
    }

    /**
     * Get Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnMatchUpLoadSwitch Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getUnMatchUpLoadSwitch() {
        return this.UnMatchUpLoadSwitch;
    }

    /**
     * Set Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnMatchUpLoadSwitch Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnMatchUpLoadSwitch(Boolean UnMatchUpLoadSwitch) {
        this.UnMatchUpLoadSwitch = UnMatchUpLoadSwitch;
    }

    /**
     * Get Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnMatchLogKey Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnMatchLogKey Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get Size of the data to be rewound in incremental collection mode. Default value: -1 (full collection)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Backtracking Size of the data to be rewound in incremental collection mode. Default value: -1 (full collection)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getBacktracking() {
        return this.Backtracking;
    }

    /**
     * Set Size of the data to be rewound in incremental collection mode. Default value: -1 (full collection)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Backtracking Size of the data to be rewound in incremental collection mode. Default value: -1 (full collection)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBacktracking(Long Backtracking) {
        this.Backtracking = Backtracking;
    }

    /**
     * Get Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsGBK Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsGBK() {
        return this.IsGBK;
    }

    /**
     * Set Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsGBK Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsGBK(Long IsGBK) {
        this.IsGBK = IsGBK;
    }

    /**
     * Get Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonStandard Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJsonStandard() {
        return this.JsonStandard;
    }

    /**
     * Set Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonStandard Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonStandard(Long JsonStandard) {
        this.JsonStandard = JsonStandard;
    }

    public ExtractRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractRuleInfo(ExtractRuleInfo source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.BeginRegex != null) {
            this.BeginRegex = new String(source.BeginRegex);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.FilterKeyRegex != null) {
            this.FilterKeyRegex = new KeyRegexInfo[source.FilterKeyRegex.length];
            for (int i = 0; i < source.FilterKeyRegex.length; i++) {
                this.FilterKeyRegex[i] = new KeyRegexInfo(source.FilterKeyRegex[i]);
            }
        }
        if (source.UnMatchUpLoadSwitch != null) {
            this.UnMatchUpLoadSwitch = new Boolean(source.UnMatchUpLoadSwitch);
        }
        if (source.UnMatchLogKey != null) {
            this.UnMatchLogKey = new String(source.UnMatchLogKey);
        }
        if (source.Backtracking != null) {
            this.Backtracking = new Long(source.Backtracking);
        }
        if (source.IsGBK != null) {
            this.IsGBK = new Long(source.IsGBK);
        }
        if (source.JsonStandard != null) {
            this.JsonStandard = new Long(source.JsonStandard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "BeginRegex", this.BeginRegex);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArrayObj(map, prefix + "FilterKeyRegex.", this.FilterKeyRegex);
        this.setParamSimple(map, prefix + "UnMatchUpLoadSwitch", this.UnMatchUpLoadSwitch);
        this.setParamSimple(map, prefix + "UnMatchLogKey", this.UnMatchLogKey);
        this.setParamSimple(map, prefix + "Backtracking", this.Backtracking);
        this.setParamSimple(map, prefix + "IsGBK", this.IsGBK);
        this.setParamSimple(map, prefix + "JsonStandard", this.JsonStandard);

    }
}

