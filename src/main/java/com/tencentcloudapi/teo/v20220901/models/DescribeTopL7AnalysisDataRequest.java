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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopL7AnalysisDataRequest extends AbstractModel{

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The query metric. Values:
<li>`l7Flow_outFlux_country`: Country the request came from;</li>
<li>`l7Flow_outFlux_statusCode`: Status code of the request;</li>
<li>`l7Flow_outFlux_domain`: Domain name of the request;</li>
<li>`l7Flow_outFlux_url`: URL of the request;</li>
<li>`l7Flow_outFlux_resourceType`: Resource type;</li>
<li>`l7Flow_outFlux_sip`: Client IP;</li>
<li>`l7Flow_outFlux_referers`: Refer header;</li>
<li>`l7Flow_outFlux_ua_device`: Device type;</li>
<li>`l7Flow_outFlux_ua_browser`: Browser type;</li>
<li>`l7Flow_outFlux_us_os`: OS type;</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * List of sites to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Queries the top n rows of data. Maximum value: 1000. Top 10 rows of data will be queried if this field is not specified.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`country`: Country/Region;</li>
<li>`domain`: Domain name;</li>
<li>`protocol`: Protocol type;</li>
<li>`resourceType`: Resource type;</li>
<li>`statusCode`: Status code;</li>
<li>`browserType`: Browser type;</li>
<li>`deviceType`: Device type;</li>
<li>`operatingSystemType`: OS type;</li>
<li>`tlsVersion`: TLS version;</li>
<li>`url`: URL address;</li>
<li>`referer`: Refer header;</li>
<li>`ipVersion`: IP version;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. 
     * @return EndTime The end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time.
     * @param EndTime The end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The query metric. Values:
<li>`l7Flow_outFlux_country`: Country the request came from;</li>
<li>`l7Flow_outFlux_statusCode`: Status code of the request;</li>
<li>`l7Flow_outFlux_domain`: Domain name of the request;</li>
<li>`l7Flow_outFlux_url`: URL of the request;</li>
<li>`l7Flow_outFlux_resourceType`: Resource type;</li>
<li>`l7Flow_outFlux_sip`: Client IP;</li>
<li>`l7Flow_outFlux_referers`: Refer header;</li>
<li>`l7Flow_outFlux_ua_device`: Device type;</li>
<li>`l7Flow_outFlux_ua_browser`: Browser type;</li>
<li>`l7Flow_outFlux_us_os`: OS type;</li> 
     * @return MetricName The query metric. Values:
<li>`l7Flow_outFlux_country`: Country the request came from;</li>
<li>`l7Flow_outFlux_statusCode`: Status code of the request;</li>
<li>`l7Flow_outFlux_domain`: Domain name of the request;</li>
<li>`l7Flow_outFlux_url`: URL of the request;</li>
<li>`l7Flow_outFlux_resourceType`: Resource type;</li>
<li>`l7Flow_outFlux_sip`: Client IP;</li>
<li>`l7Flow_outFlux_referers`: Refer header;</li>
<li>`l7Flow_outFlux_ua_device`: Device type;</li>
<li>`l7Flow_outFlux_ua_browser`: Browser type;</li>
<li>`l7Flow_outFlux_us_os`: OS type;</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set The query metric. Values:
<li>`l7Flow_outFlux_country`: Country the request came from;</li>
<li>`l7Flow_outFlux_statusCode`: Status code of the request;</li>
<li>`l7Flow_outFlux_domain`: Domain name of the request;</li>
<li>`l7Flow_outFlux_url`: URL of the request;</li>
<li>`l7Flow_outFlux_resourceType`: Resource type;</li>
<li>`l7Flow_outFlux_sip`: Client IP;</li>
<li>`l7Flow_outFlux_referers`: Refer header;</li>
<li>`l7Flow_outFlux_ua_device`: Device type;</li>
<li>`l7Flow_outFlux_ua_browser`: Browser type;</li>
<li>`l7Flow_outFlux_us_os`: OS type;</li>
     * @param MetricName The query metric. Values:
<li>`l7Flow_outFlux_country`: Country the request came from;</li>
<li>`l7Flow_outFlux_statusCode`: Status code of the request;</li>
<li>`l7Flow_outFlux_domain`: Domain name of the request;</li>
<li>`l7Flow_outFlux_url`: URL of the request;</li>
<li>`l7Flow_outFlux_resourceType`: Resource type;</li>
<li>`l7Flow_outFlux_sip`: Client IP;</li>
<li>`l7Flow_outFlux_referers`: Refer header;</li>
<li>`l7Flow_outFlux_ua_device`: Device type;</li>
<li>`l7Flow_outFlux_ua_browser`: Browser type;</li>
<li>`l7Flow_outFlux_us_os`: OS type;</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get List of sites to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of sites to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Queries the top n rows of data. Maximum value: 1000. Top 10 rows of data will be queried if this field is not specified. 
     * @return Limit Queries the top n rows of data. Maximum value: 1000. Top 10 rows of data will be queried if this field is not specified.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Queries the top n rows of data. Maximum value: 1000. Top 10 rows of data will be queried if this field is not specified.
     * @param Limit Queries the top n rows of data. Maximum value: 1000. Top 10 rows of data will be queried if this field is not specified.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`country`: Country/Region;</li>
<li>`domain`: Domain name;</li>
<li>`protocol`: Protocol type;</li>
<li>`resourceType`: Resource type;</li>
<li>`statusCode`: Status code;</li>
<li>`browserType`: Browser type;</li>
<li>`deviceType`: Device type;</li>
<li>`operatingSystemType`: OS type;</li>
<li>`tlsVersion`: TLS version;</li>
<li>`url`: URL address;</li>
<li>`referer`: Refer header;</li>
<li>`ipVersion`: IP version;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li> 
     * @return Filters The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`country`: Country/Region;</li>
<li>`domain`: Domain name;</li>
<li>`protocol`: Protocol type;</li>
<li>`resourceType`: Resource type;</li>
<li>`statusCode`: Status code;</li>
<li>`browserType`: Browser type;</li>
<li>`deviceType`: Device type;</li>
<li>`operatingSystemType`: OS type;</li>
<li>`tlsVersion`: TLS version;</li>
<li>`url`: URL address;</li>
<li>`referer`: Refer header;</li>
<li>`ipVersion`: IP version;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`country`: Country/Region;</li>
<li>`domain`: Domain name;</li>
<li>`protocol`: Protocol type;</li>
<li>`resourceType`: Resource type;</li>
<li>`statusCode`: Status code;</li>
<li>`browserType`: Browser type;</li>
<li>`deviceType`: Device type;</li>
<li>`operatingSystemType`: OS type;</li>
<li>`tlsVersion`: TLS version;</li>
<li>`url`: URL address;</li>
<li>`referer`: Refer header;</li>
<li>`ipVersion`: IP version;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
     * @param Filters The key of the parameter QueryCondition, which is used to specify a filter. Values:
<li>`country`: Country/Region;</li>
<li>`domain`: Domain name;</li>
<li>`protocol`: Protocol type;</li>
<li>`resourceType`: Resource type;</li>
<li>`statusCode`: Status code;</li>
<li>`browserType`: Browser type;</li>
<li>`deviceType`: Device type;</li>
<li>`operatingSystemType`: OS type;</li>
<li>`tlsVersion`: TLS version;</li>
<li>`url`: URL address;</li>
<li>`referer`: Refer header;</li>
<li>`ipVersion`: IP version;</li>
<li>`tagKey`: Tag key;</li>
<li>`tagValue`: Tag value.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days. 
     * @return Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     * @param Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location. 
     * @return Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     * @param Area Data storage region. Values:
<li>`overseas`: Global (outside the Chinese mainland);</li>
<li>`mainland`: Chinese mainland.</li>If this field is not specified, the data storage region will be determined based on the user’s location.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTopL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7AnalysisDataRequest(DescribeTopL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

