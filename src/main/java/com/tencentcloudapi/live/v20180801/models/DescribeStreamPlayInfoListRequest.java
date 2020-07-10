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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPlayInfoListRequest extends AbstractModel{

    /**
    * Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS,
The start time cannot be more than 30 days after the current time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The end time and start time must be on the same day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Playback domain name.
If it is left blank, data of live streams of all playback domain names will be queried.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * Stream name (exact match).
If it is left blank, the full playback data will be queried.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * push and playback addresses and is "live" by default. Exact match is required. Fuzzy match is not supported.
If it is left blank, the full playback data will be queried.
Note: To query by AppName, you need to submit a ticket for application.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * Get Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS,
The start time cannot be more than 30 days after the current time. 
     * @return StartTime Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS,
The start time cannot be more than 30 days after the current time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS,
The start time cannot be more than 30 days after the current time.
     * @param StartTime Start time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS,
The start time cannot be more than 30 days after the current time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The end time and start time must be on the same day. 
     * @return EndTime End time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The end time and start time must be on the same day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The end time and start time must be on the same day.
     * @param EndTime End time (Beijing time) in the format of yyyy-mm-dd HH:MM:SS.
The end time and start time must be on the same day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Playback domain name.
If it is left blank, data of live streams of all playback domain names will be queried. 
     * @return PlayDomain Playback domain name.
If it is left blank, data of live streams of all playback domain names will be queried.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Playback domain name.
If it is left blank, data of live streams of all playback domain names will be queried.
     * @param PlayDomain Playback domain name.
If it is left blank, data of live streams of all playback domain names will be queried.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get Stream name (exact match).
If it is left blank, the full playback data will be queried. 
     * @return StreamName Stream name (exact match).
If it is left blank, the full playback data will be queried.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name (exact match).
If it is left blank, the full playback data will be queried.
     * @param StreamName Stream name (exact match).
If it is left blank, the full playback data will be queried.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get push and playback addresses and is "live" by default. Exact match is required. Fuzzy match is not supported.
If it is left blank, the full playback data will be queried.
Note: To query by AppName, you need to submit a ticket for application. 
     * @return AppName push and playback addresses and is "live" by default. Exact match is required. Fuzzy match is not supported.
If it is left blank, the full playback data will be queried.
Note: To query by AppName, you need to submit a ticket for application.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set push and playback addresses and is "live" by default. Exact match is required. Fuzzy match is not supported.
If it is left blank, the full playback data will be queried.
Note: To query by AppName, you need to submit a ticket for application.
     * @param AppName push and playback addresses and is "live" by default. Exact match is required. Fuzzy match is not supported.
If it is left blank, the full playback data will be queried.
Note: To query by AppName, you need to submit a ticket for application.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

