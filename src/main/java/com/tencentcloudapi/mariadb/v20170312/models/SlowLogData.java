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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogData extends AbstractModel{

    /**
    * Statement checksum for querying details
    */
    @SerializedName("CheckSum")
    @Expose
    private String CheckSum;

    /**
    * Database name
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Abstracted SQL statement
    */
    @SerializedName("FingerPrint")
    @Expose
    private String FingerPrint;

    /**
    * Average lock duration
    */
    @SerializedName("LockTimeAvg")
    @Expose
    private String LockTimeAvg;

    /**
    * Maximum lock duration
    */
    @SerializedName("LockTimeMax")
    @Expose
    private String LockTimeMax;

    /**
    * Minimum lock duration
    */
    @SerializedName("LockTimeMin")
    @Expose
    private String LockTimeMin;

    /**
    * Sum of lock durations
    */
    @SerializedName("LockTimeSum")
    @Expose
    private String LockTimeSum;

    /**
    * Number of queries
    */
    @SerializedName("QueryCount")
    @Expose
    private String QueryCount;

    /**
    * Average query duration
    */
    @SerializedName("QueryTimeAvg")
    @Expose
    private String QueryTimeAvg;

    /**
    * Maximum query duration
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private String QueryTimeMax;

    /**
    * Minimum query duration
    */
    @SerializedName("QueryTimeMin")
    @Expose
    private String QueryTimeMin;

    /**
    * Sum of query durations
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private String QueryTimeSum;

    /**
    * Number of scanned rows
    */
    @SerializedName("RowsExaminedSum")
    @Expose
    private String RowsExaminedSum;

    /**
    * Number of sent rows
    */
    @SerializedName("RowsSentSum")
    @Expose
    private String RowsSentSum;

    /**
    * Last execution time
    */
    @SerializedName("TsMax")
    @Expose
    private String TsMax;

    /**
    * First execution time
    */
    @SerializedName("TsMin")
    @Expose
    private String TsMin;

    /**
    * Account
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Sample SQL
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExampleSql")
    @Expose
    private String ExampleSql;

    /**
    * Host address of the account
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Statement checksum for querying details 
     * @return CheckSum Statement checksum for querying details
     */
    public String getCheckSum() {
        return this.CheckSum;
    }

    /**
     * Set Statement checksum for querying details
     * @param CheckSum Statement checksum for querying details
     */
    public void setCheckSum(String CheckSum) {
        this.CheckSum = CheckSum;
    }

    /**
     * Get Database name 
     * @return Db Database name
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Database name
     * @param Db Database name
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Abstracted SQL statement 
     * @return FingerPrint Abstracted SQL statement
     */
    public String getFingerPrint() {
        return this.FingerPrint;
    }

    /**
     * Set Abstracted SQL statement
     * @param FingerPrint Abstracted SQL statement
     */
    public void setFingerPrint(String FingerPrint) {
        this.FingerPrint = FingerPrint;
    }

    /**
     * Get Average lock duration 
     * @return LockTimeAvg Average lock duration
     */
    public String getLockTimeAvg() {
        return this.LockTimeAvg;
    }

    /**
     * Set Average lock duration
     * @param LockTimeAvg Average lock duration
     */
    public void setLockTimeAvg(String LockTimeAvg) {
        this.LockTimeAvg = LockTimeAvg;
    }

    /**
     * Get Maximum lock duration 
     * @return LockTimeMax Maximum lock duration
     */
    public String getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * Set Maximum lock duration
     * @param LockTimeMax Maximum lock duration
     */
    public void setLockTimeMax(String LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * Get Minimum lock duration 
     * @return LockTimeMin Minimum lock duration
     */
    public String getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * Set Minimum lock duration
     * @param LockTimeMin Minimum lock duration
     */
    public void setLockTimeMin(String LockTimeMin) {
        this.LockTimeMin = LockTimeMin;
    }

    /**
     * Get Sum of lock durations 
     * @return LockTimeSum Sum of lock durations
     */
    public String getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * Set Sum of lock durations
     * @param LockTimeSum Sum of lock durations
     */
    public void setLockTimeSum(String LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * Get Number of queries 
     * @return QueryCount Number of queries
     */
    public String getQueryCount() {
        return this.QueryCount;
    }

    /**
     * Set Number of queries
     * @param QueryCount Number of queries
     */
    public void setQueryCount(String QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * Get Average query duration 
     * @return QueryTimeAvg Average query duration
     */
    public String getQueryTimeAvg() {
        return this.QueryTimeAvg;
    }

    /**
     * Set Average query duration
     * @param QueryTimeAvg Average query duration
     */
    public void setQueryTimeAvg(String QueryTimeAvg) {
        this.QueryTimeAvg = QueryTimeAvg;
    }

    /**
     * Get Maximum query duration 
     * @return QueryTimeMax Maximum query duration
     */
    public String getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * Set Maximum query duration
     * @param QueryTimeMax Maximum query duration
     */
    public void setQueryTimeMax(String QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * Get Minimum query duration 
     * @return QueryTimeMin Minimum query duration
     */
    public String getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * Set Minimum query duration
     * @param QueryTimeMin Minimum query duration
     */
    public void setQueryTimeMin(String QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * Get Sum of query durations 
     * @return QueryTimeSum Sum of query durations
     */
    public String getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * Set Sum of query durations
     * @param QueryTimeSum Sum of query durations
     */
    public void setQueryTimeSum(String QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
    }

    /**
     * Get Number of scanned rows 
     * @return RowsExaminedSum Number of scanned rows
     */
    public String getRowsExaminedSum() {
        return this.RowsExaminedSum;
    }

    /**
     * Set Number of scanned rows
     * @param RowsExaminedSum Number of scanned rows
     */
    public void setRowsExaminedSum(String RowsExaminedSum) {
        this.RowsExaminedSum = RowsExaminedSum;
    }

    /**
     * Get Number of sent rows 
     * @return RowsSentSum Number of sent rows
     */
    public String getRowsSentSum() {
        return this.RowsSentSum;
    }

    /**
     * Set Number of sent rows
     * @param RowsSentSum Number of sent rows
     */
    public void setRowsSentSum(String RowsSentSum) {
        this.RowsSentSum = RowsSentSum;
    }

    /**
     * Get Last execution time 
     * @return TsMax Last execution time
     */
    public String getTsMax() {
        return this.TsMax;
    }

    /**
     * Set Last execution time
     * @param TsMax Last execution time
     */
    public void setTsMax(String TsMax) {
        this.TsMax = TsMax;
    }

    /**
     * Get First execution time 
     * @return TsMin First execution time
     */
    public String getTsMin() {
        return this.TsMin;
    }

    /**
     * Set First execution time
     * @param TsMin First execution time
     */
    public void setTsMin(String TsMin) {
        this.TsMin = TsMin;
    }

    /**
     * Get Account 
     * @return User Account
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Account
     * @param User Account
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Sample SQL
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExampleSql Sample SQL
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExampleSql() {
        return this.ExampleSql;
    }

    /**
     * Set Sample SQL
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExampleSql Sample SQL
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExampleSql(String ExampleSql) {
        this.ExampleSql = ExampleSql;
    }

    /**
     * Get Host address of the account 
     * @return Host Host address of the account
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host address of the account
     * @param Host Host address of the account
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public SlowLogData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogData(SlowLogData source) {
        if (source.CheckSum != null) {
            this.CheckSum = new String(source.CheckSum);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.FingerPrint != null) {
            this.FingerPrint = new String(source.FingerPrint);
        }
        if (source.LockTimeAvg != null) {
            this.LockTimeAvg = new String(source.LockTimeAvg);
        }
        if (source.LockTimeMax != null) {
            this.LockTimeMax = new String(source.LockTimeMax);
        }
        if (source.LockTimeMin != null) {
            this.LockTimeMin = new String(source.LockTimeMin);
        }
        if (source.LockTimeSum != null) {
            this.LockTimeSum = new String(source.LockTimeSum);
        }
        if (source.QueryCount != null) {
            this.QueryCount = new String(source.QueryCount);
        }
        if (source.QueryTimeAvg != null) {
            this.QueryTimeAvg = new String(source.QueryTimeAvg);
        }
        if (source.QueryTimeMax != null) {
            this.QueryTimeMax = new String(source.QueryTimeMax);
        }
        if (source.QueryTimeMin != null) {
            this.QueryTimeMin = new String(source.QueryTimeMin);
        }
        if (source.QueryTimeSum != null) {
            this.QueryTimeSum = new String(source.QueryTimeSum);
        }
        if (source.RowsExaminedSum != null) {
            this.RowsExaminedSum = new String(source.RowsExaminedSum);
        }
        if (source.RowsSentSum != null) {
            this.RowsSentSum = new String(source.RowsSentSum);
        }
        if (source.TsMax != null) {
            this.TsMax = new String(source.TsMax);
        }
        if (source.TsMin != null) {
            this.TsMin = new String(source.TsMin);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ExampleSql != null) {
            this.ExampleSql = new String(source.ExampleSql);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckSum", this.CheckSum);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "FingerPrint", this.FingerPrint);
        this.setParamSimple(map, prefix + "LockTimeAvg", this.LockTimeAvg);
        this.setParamSimple(map, prefix + "LockTimeMax", this.LockTimeMax);
        this.setParamSimple(map, prefix + "LockTimeMin", this.LockTimeMin);
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "QueryTimeAvg", this.QueryTimeAvg);
        this.setParamSimple(map, prefix + "QueryTimeMax", this.QueryTimeMax);
        this.setParamSimple(map, prefix + "QueryTimeMin", this.QueryTimeMin);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamSimple(map, prefix + "RowsExaminedSum", this.RowsExaminedSum);
        this.setParamSimple(map, prefix + "RowsSentSum", this.RowsSentSum);
        this.setParamSimple(map, prefix + "TsMax", this.TsMax);
        this.setParamSimple(map, prefix + "TsMin", this.TsMin);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ExampleSql", this.ExampleSql);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

