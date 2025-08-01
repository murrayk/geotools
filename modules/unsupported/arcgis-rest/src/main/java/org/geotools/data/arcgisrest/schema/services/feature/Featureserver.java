/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2018, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 */

package org.geotools.data.arcgisrest.schema.services.feature;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Featureserver {

    /** (Required) */
    @SerializedName("currentVersion")
    @Expose
    private Double currentVersion;
    /** (Required) */
    @SerializedName("serviceItemId")
    @Expose
    private String serviceItemId;
    /** (Required) */
    @SerializedName("serviceDescription")
    @Expose
    private String serviceDescription;
    /** (Required) */
    @SerializedName("hasVersionedData")
    @Expose
    private Boolean hasVersionedData;
    /** (Required) */
    @SerializedName("supportsDisconnectedEditing")
    @Expose
    private Boolean supportsDisconnectedEditing;
    /** (Required) */
    @SerializedName("hasStaticData")
    @Expose
    private Boolean hasStaticData;
    /** (Required) */
    @SerializedName("maxRecordCount")
    @Expose
    private Integer maxRecordCount;
    /** (Required) */
    @SerializedName("supportedQueryFormats")
    @Expose
    private String supportedQueryFormats;
    /** (Required) */
    @SerializedName("capabilities")
    @Expose
    private String capabilities;
    /** (Required) */
    @SerializedName("description")
    @Expose
    private String description;
    /** (Required) */
    @SerializedName("copyrightText")
    @Expose
    private String copyrightText;
    /** (Required) */
    @SerializedName("spatialReference")
    @Expose
    private SpatialReference spatialReference;
    /** (Required) */
    @SerializedName("initialExtent")
    @Expose
    private InitialExtent initialExtent;
    /** (Required) */
    @SerializedName("fullExtent")
    @Expose
    private FullExtent fullExtent;
    /** (Required) */
    @SerializedName("allowGeometryUpdates")
    @Expose
    private Boolean allowGeometryUpdates;
    /** (Required) */
    @SerializedName("units")
    @Expose
    private String units;
    /** (Required) */
    @SerializedName("size")
    @Expose
    private Integer size;
    /** (Required) */
    @SerializedName("syncEnabled")
    @Expose
    private Boolean syncEnabled;
    /** (Required) */
    @SerializedName("syncCapabilities")
    @Expose
    private SyncCapabilities syncCapabilities;
    /** (Required) */
    @SerializedName("supportsApplyEditsWithGlobalIds")
    @Expose
    private Boolean supportsApplyEditsWithGlobalIds;
    /** (Required) */
    @SerializedName("editorTrackingInfo")
    @Expose
    private EditorTrackingInfo editorTrackingInfo;
    /** (Required) */
    @SerializedName("xssPreventionInfo")
    @Expose
    private XssPreventionInfo xssPreventionInfo;
    /** (Required) */
    @SerializedName("layers")
    @Expose
    private List<Layer> layers = new ArrayList<>();
    /** (Required) */
    @SerializedName("tables")
    @Expose
    private List<Object> tables = new ArrayList<>();

    /** (Required) */
    public Double getCurrentVersion() {
        return currentVersion;
    }

    /** (Required) */
    public void setCurrentVersion(Double currentVersion) {
        this.currentVersion = currentVersion;
    }

    /** (Required) */
    public String getServiceItemId() {
        return serviceItemId;
    }

    /** (Required) */
    public void setServiceItemId(String serviceItemId) {
        this.serviceItemId = serviceItemId;
    }

    /** (Required) */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /** (Required) */
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    /** (Required) */
    public Boolean getHasVersionedData() {
        return hasVersionedData;
    }

    /** (Required) */
    public void setHasVersionedData(Boolean hasVersionedData) {
        this.hasVersionedData = hasVersionedData;
    }

    /** (Required) */
    public Boolean getSupportsDisconnectedEditing() {
        return supportsDisconnectedEditing;
    }

    /** (Required) */
    public void setSupportsDisconnectedEditing(Boolean supportsDisconnectedEditing) {
        this.supportsDisconnectedEditing = supportsDisconnectedEditing;
    }

    /** (Required) */
    public Boolean getHasStaticData() {
        return hasStaticData;
    }

    /** (Required) */
    public void setHasStaticData(Boolean hasStaticData) {
        this.hasStaticData = hasStaticData;
    }

    /** (Required) */
    public Integer getMaxRecordCount() {
        return maxRecordCount;
    }

    /** (Required) */
    public void setMaxRecordCount(Integer maxRecordCount) {
        this.maxRecordCount = maxRecordCount;
    }

    /** (Required) */
    public String getSupportedQueryFormats() {
        return supportedQueryFormats;
    }

    /** (Required) */
    public void setSupportedQueryFormats(String supportedQueryFormats) {
        this.supportedQueryFormats = supportedQueryFormats;
    }

    /** (Required) */
    public String getCapabilities() {
        return capabilities;
    }

    /** (Required) */
    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    /** (Required) */
    public String getDescription() {
        return description;
    }

    /** (Required) */
    public void setDescription(String description) {
        this.description = description;
    }

    /** (Required) */
    public String getCopyrightText() {
        return copyrightText;
    }

    /** (Required) */
    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    /** (Required) */
    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    /** (Required) */
    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    /** (Required) */
    public InitialExtent getInitialExtent() {
        return initialExtent;
    }

    /** (Required) */
    public void setInitialExtent(InitialExtent initialExtent) {
        this.initialExtent = initialExtent;
    }

    /** (Required) */
    public FullExtent getFullExtent() {
        return fullExtent;
    }

    /** (Required) */
    public void setFullExtent(FullExtent fullExtent) {
        this.fullExtent = fullExtent;
    }

    /** (Required) */
    public Boolean getAllowGeometryUpdates() {
        return allowGeometryUpdates;
    }

    /** (Required) */
    public void setAllowGeometryUpdates(Boolean allowGeometryUpdates) {
        this.allowGeometryUpdates = allowGeometryUpdates;
    }

    /** (Required) */
    public String getUnits() {
        return units;
    }

    /** (Required) */
    public void setUnits(String units) {
        this.units = units;
    }

    /** (Required) */
    public Integer getSize() {
        return size;
    }

    /** (Required) */
    public void setSize(Integer size) {
        this.size = size;
    }

    /** (Required) */
    public Boolean getSyncEnabled() {
        return syncEnabled;
    }

    /** (Required) */
    public void setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
    }

    /** (Required) */
    public SyncCapabilities getSyncCapabilities() {
        return syncCapabilities;
    }

    /** (Required) */
    public void setSyncCapabilities(SyncCapabilities syncCapabilities) {
        this.syncCapabilities = syncCapabilities;
    }

    /** (Required) */
    public Boolean getSupportsApplyEditsWithGlobalIds() {
        return supportsApplyEditsWithGlobalIds;
    }

    /** (Required) */
    public void setSupportsApplyEditsWithGlobalIds(Boolean supportsApplyEditsWithGlobalIds) {
        this.supportsApplyEditsWithGlobalIds = supportsApplyEditsWithGlobalIds;
    }

    /** (Required) */
    public EditorTrackingInfo getEditorTrackingInfo() {
        return editorTrackingInfo;
    }

    /** (Required) */
    public void setEditorTrackingInfo(EditorTrackingInfo editorTrackingInfo) {
        this.editorTrackingInfo = editorTrackingInfo;
    }

    /** (Required) */
    public XssPreventionInfo getXssPreventionInfo() {
        return xssPreventionInfo;
    }

    /** (Required) */
    public void setXssPreventionInfo(XssPreventionInfo xssPreventionInfo) {
        this.xssPreventionInfo = xssPreventionInfo;
    }

    /** (Required) */
    public List<Layer> getLayers() {
        return layers;
    }

    /** (Required) */
    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    /** (Required) */
    public List<Object> getTables() {
        return tables;
    }

    /** (Required) */
    public void setTables(List<Object> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Featureserver.class.getName())
                .append('@')
                .append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("currentVersion");
        sb.append('=');
        sb.append(((this.currentVersion == null) ? "<null>" : this.currentVersion));
        sb.append(',');
        sb.append("serviceItemId");
        sb.append('=');
        sb.append(((this.serviceItemId == null) ? "<null>" : this.serviceItemId));
        sb.append(',');
        sb.append("serviceDescription");
        sb.append('=');
        sb.append(((this.serviceDescription == null) ? "<null>" : this.serviceDescription));
        sb.append(',');
        sb.append("hasVersionedData");
        sb.append('=');
        sb.append(((this.hasVersionedData == null) ? "<null>" : this.hasVersionedData));
        sb.append(',');
        sb.append("supportsDisconnectedEditing");
        sb.append('=');
        sb.append(((this.supportsDisconnectedEditing == null) ? "<null>" : this.supportsDisconnectedEditing));
        sb.append(',');
        sb.append("hasStaticData");
        sb.append('=');
        sb.append(((this.hasStaticData == null) ? "<null>" : this.hasStaticData));
        sb.append(',');
        sb.append("maxRecordCount");
        sb.append('=');
        sb.append(((this.maxRecordCount == null) ? "<null>" : this.maxRecordCount));
        sb.append(',');
        sb.append("supportedQueryFormats");
        sb.append('=');
        sb.append(((this.supportedQueryFormats == null) ? "<null>" : this.supportedQueryFormats));
        sb.append(',');
        sb.append("capabilities");
        sb.append('=');
        sb.append(((this.capabilities == null) ? "<null>" : this.capabilities));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("copyrightText");
        sb.append('=');
        sb.append(((this.copyrightText == null) ? "<null>" : this.copyrightText));
        sb.append(',');
        sb.append("spatialReference");
        sb.append('=');
        sb.append(((this.spatialReference == null) ? "<null>" : this.spatialReference));
        sb.append(',');
        sb.append("initialExtent");
        sb.append('=');
        sb.append(((this.initialExtent == null) ? "<null>" : this.initialExtent));
        sb.append(',');
        sb.append("fullExtent");
        sb.append('=');
        sb.append(((this.fullExtent == null) ? "<null>" : this.fullExtent));
        sb.append(',');
        sb.append("allowGeometryUpdates");
        sb.append('=');
        sb.append(((this.allowGeometryUpdates == null) ? "<null>" : this.allowGeometryUpdates));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null) ? "<null>" : this.units));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("syncEnabled");
        sb.append('=');
        sb.append(((this.syncEnabled == null) ? "<null>" : this.syncEnabled));
        sb.append(',');
        sb.append("syncCapabilities");
        sb.append('=');
        sb.append(((this.syncCapabilities == null) ? "<null>" : this.syncCapabilities));
        sb.append(',');
        sb.append("supportsApplyEditsWithGlobalIds");
        sb.append('=');
        sb.append(((this.supportsApplyEditsWithGlobalIds == null) ? "<null>" : this.supportsApplyEditsWithGlobalIds));
        sb.append(',');
        sb.append("editorTrackingInfo");
        sb.append('=');
        sb.append(((this.editorTrackingInfo == null) ? "<null>" : this.editorTrackingInfo));
        sb.append(',');
        sb.append("xssPreventionInfo");
        sb.append('=');
        sb.append(((this.xssPreventionInfo == null) ? "<null>" : this.xssPreventionInfo));
        sb.append(',');
        sb.append("layers");
        sb.append('=');
        sb.append(((this.layers == null) ? "<null>" : this.layers));
        sb.append(',');
        sb.append("tables");
        sb.append('=');
        sb.append(((this.tables == null) ? "<null>" : this.tables));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.allowGeometryUpdates == null) ? 0 : this.allowGeometryUpdates.hashCode()));
        result = ((result * 31)
                + ((this.supportsApplyEditsWithGlobalIds == null)
                        ? 0
                        : this.supportsApplyEditsWithGlobalIds.hashCode()));
        result = ((result * 31) + ((this.maxRecordCount == null) ? 0 : this.maxRecordCount.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.units == null) ? 0 : this.units.hashCode()));
        result = ((result * 31) + ((this.hasStaticData == null) ? 0 : this.hasStaticData.hashCode()));
        result = ((result * 31) + ((this.syncEnabled == null) ? 0 : this.syncEnabled.hashCode()));
        result = ((result * 31) + ((this.tables == null) ? 0 : this.tables.hashCode()));
        result = ((result * 31) + ((this.hasVersionedData == null) ? 0 : this.hasVersionedData.hashCode()));
        result = ((result * 31) + ((this.layers == null) ? 0 : this.layers.hashCode()));
        result = ((result * 31) + ((this.spatialReference == null) ? 0 : this.spatialReference.hashCode()));
        result = ((result * 31) + ((this.serviceItemId == null) ? 0 : this.serviceItemId.hashCode()));
        result = ((result * 31) + ((this.fullExtent == null) ? 0 : this.fullExtent.hashCode()));
        result = ((result * 31) + ((this.capabilities == null) ? 0 : this.capabilities.hashCode()));
        result = ((result * 31) + ((this.xssPreventionInfo == null) ? 0 : this.xssPreventionInfo.hashCode()));
        result = ((result * 31) + ((this.syncCapabilities == null) ? 0 : this.syncCapabilities.hashCode()));
        result = ((result * 31)
                + ((this.supportsDisconnectedEditing == null) ? 0 : this.supportsDisconnectedEditing.hashCode()));
        result = ((result * 31) + ((this.currentVersion == null) ? 0 : this.currentVersion.hashCode()));
        result = ((result * 31) + ((this.supportedQueryFormats == null) ? 0 : this.supportedQueryFormats.hashCode()));
        result = ((result * 31) + ((this.size == null) ? 0 : this.size.hashCode()));
        result = ((result * 31) + ((this.initialExtent == null) ? 0 : this.initialExtent.hashCode()));
        result = ((result * 31) + ((this.serviceDescription == null) ? 0 : this.serviceDescription.hashCode()));
        result = ((result * 31) + ((this.editorTrackingInfo == null) ? 0 : this.editorTrackingInfo.hashCode()));
        result = ((result * 31) + ((this.copyrightText == null) ? 0 : this.copyrightText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Featureserver) == false) {
            return false;
        }
        Featureserver rhs = ((Featureserver) other);
        return Objects.equals(this.allowGeometryUpdates, rhs.allowGeometryUpdates)
                && Objects.equals(this.supportsApplyEditsWithGlobalIds, rhs.supportsApplyEditsWithGlobalIds)
                && Objects.equals(this.maxRecordCount, rhs.maxRecordCount)
                && Objects.equals(this.description, rhs.description)
                && Objects.equals(this.units, rhs.units)
                && Objects.equals(this.hasStaticData, rhs.hasStaticData)
                && Objects.equals(this.syncEnabled, rhs.syncEnabled)
                && Objects.equals(this.tables, rhs.tables)
                && Objects.equals(this.hasVersionedData, rhs.hasVersionedData)
                && Objects.equals(this.layers, rhs.layers)
                && Objects.equals(this.serviceDescription, rhs.serviceDescription)
                && Objects.equals(this.serviceItemId, rhs.serviceItemId)
                && Objects.equals(this.fullExtent, rhs.fullExtent)
                && Objects.equals(this.capabilities, rhs.capabilities)
                && Objects.equals(this.xssPreventionInfo, rhs.xssPreventionInfo)
                && Objects.equals(this.syncCapabilities, rhs.syncCapabilities)
                && Objects.equals(this.supportsDisconnectedEditing, rhs.supportsDisconnectedEditing)
                && Objects.equals(this.currentVersion, rhs.currentVersion)
                && Objects.equals(this.supportedQueryFormats, rhs.supportedQueryFormats)
                && Objects.equals(this.size, rhs.size)
                && Objects.equals(this.initialExtent, rhs.initialExtent)
                && Objects.equals(this.serviceDescription, rhs.serviceDescription)
                && Objects.equals(this.editorTrackingInfo, rhs.editorTrackingInfo)
                && Objects.equals(this.copyrightText, rhs.copyrightText);
    }
}
