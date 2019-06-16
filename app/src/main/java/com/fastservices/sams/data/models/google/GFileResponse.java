
package com.fastservices.sams.data.models.google;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GFileResponse {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("webContentLink")
    @Expose
    private String webContentLink;
    @SerializedName("alternateLink")
    @Expose
    private String alternateLink;
    @SerializedName("embedLink")
    @Expose
    private String embedLink;
    @SerializedName("iconLink")
    @Expose
    private String iconLink;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("mimeType")
    @Expose
    private String mimeType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("labels")
    @Expose
    private Labels labels;
    @SerializedName("copyRequiresWriterPermission")
    @Expose
    private boolean copyRequiresWriterPermission;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("modifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("modifiedByMeDate")
    @Expose
    private String modifiedByMeDate;
    @SerializedName("lastViewedByMeDate")
    @Expose
    private String lastViewedByMeDate;
    @SerializedName("markedViewedByMeDate")
    @Expose
    private String markedViewedByMeDate;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("parents")
    @Expose
    private List<Parent> parents = null;
    @SerializedName("downloadUrl")
    @Expose
    private String downloadUrl;
    @SerializedName("userPermission")
    @Expose
    private UserPermission userPermission;
    @SerializedName("originalFilename")
    @Expose
    private String originalFilename;
    @SerializedName("fileExtension")
    @Expose
    private String fileExtension;
    @SerializedName("md5Checksum")
    @Expose
    private String md5Checksum;
    @SerializedName("fileSize")
    @Expose
    private String fileSize;
    @SerializedName("quotaBytesUsed")
    @Expose
    private String quotaBytesUsed;
    @SerializedName("ownerNames")
    @Expose
    private List<String> ownerNames = null;
    @SerializedName("owners")
    @Expose
    private List<Owner> owners = null;
    @SerializedName("lastModifyingUserName")
    @Expose
    private String lastModifyingUserName;
    @SerializedName("lastModifyingUser")
    @Expose
    private LastModifyingUser lastModifyingUser;
    @SerializedName("capabilities")
    @Expose
    private Capabilities capabilities;
    @SerializedName("editable")
    @Expose
    private boolean editable;
    @SerializedName("copyable")
    @Expose
    private boolean copyable;
    @SerializedName("writersCanShare")
    @Expose
    private boolean writersCanShare;
    @SerializedName("shared")
    @Expose
    private boolean shared;
    @SerializedName("explicitlyTrashed")
    @Expose
    private boolean explicitlyTrashed;
    @SerializedName("appDataContents")
    @Expose
    private boolean appDataContents;
    @SerializedName("headRevisionId")
    @Expose
    private String headRevisionId;
    @SerializedName("imageMediaMetadata")
    @Expose
    private ImageMediaMetadata imageMediaMetadata;
    @SerializedName("spaces")
    @Expose
    private List<String> spaces = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public String getWebContentLink() {
        return webContentLink;
    }

    public void setWebContentLink(String webContentLink) {
        this.webContentLink = webContentLink;
    }

    public String getAlternateLink() {
        return alternateLink;
    }

    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    public String getEmbedLink() {
        return embedLink;
    }

    public void setEmbedLink(String embedLink) {
        this.embedLink = embedLink;
    }

    public String getIconLink() {
        return iconLink;
    }

    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public boolean isCopyRequiresWriterPermission() {
        return copyRequiresWriterPermission;
    }

    public void setCopyRequiresWriterPermission(boolean copyRequiresWriterPermission) {
        this.copyRequiresWriterPermission = copyRequiresWriterPermission;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedByMeDate() {
        return modifiedByMeDate;
    }

    public void setModifiedByMeDate(String modifiedByMeDate) {
        this.modifiedByMeDate = modifiedByMeDate;
    }

    public String getLastViewedByMeDate() {
        return lastViewedByMeDate;
    }

    public void setLastViewedByMeDate(String lastViewedByMeDate) {
        this.lastViewedByMeDate = lastViewedByMeDate;
    }

    public String getMarkedViewedByMeDate() {
        return markedViewedByMeDate;
    }

    public void setMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public UserPermission getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getMd5Checksum() {
        return md5Checksum;
    }

    public void setMd5Checksum(String md5Checksum) {
        this.md5Checksum = md5Checksum;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    public void setQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public String getLastModifyingUserName() {
        return lastModifyingUserName;
    }

    public void setLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
    }

    public LastModifyingUser getLastModifyingUser() {
        return lastModifyingUser;
    }

    public void setLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isCopyable() {
        return copyable;
    }

    public void setCopyable(boolean copyable) {
        this.copyable = copyable;
    }

    public boolean isWritersCanShare() {
        return writersCanShare;
    }

    public void setWritersCanShare(boolean writersCanShare) {
        this.writersCanShare = writersCanShare;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public boolean isExplicitlyTrashed() {
        return explicitlyTrashed;
    }

    public void setExplicitlyTrashed(boolean explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
    }

    public boolean isAppDataContents() {
        return appDataContents;
    }

    public void setAppDataContents(boolean appDataContents) {
        this.appDataContents = appDataContents;
    }

    public String getHeadRevisionId() {
        return headRevisionId;
    }

    public void setHeadRevisionId(String headRevisionId) {
        this.headRevisionId = headRevisionId;
    }

    public ImageMediaMetadata getImageMediaMetadata() {
        return imageMediaMetadata;
    }

    public void setImageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
        this.imageMediaMetadata = imageMediaMetadata;
    }

    public List<String> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<String> spaces) {
        this.spaces = spaces;
    }

}
