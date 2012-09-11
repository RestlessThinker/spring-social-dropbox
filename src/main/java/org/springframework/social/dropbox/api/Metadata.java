package org.springframework.social.dropbox.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Metadata which describes a directory or file
 * in Dropbox
 * 
 * @author Robert Drysdale
 *
 */
public class Metadata implements Serializable {
	private static final long serialVersionUID = 1L;
	private String size;
	private int bytes;
	private boolean isDir;
	private boolean isDeleted;
	private String rev;
	private String hash;
	private boolean thumbExists;
	private String icon;
	private Date modified;
	private String root;
	private String path;
	private String mimeType;
	private List<Metadata> contents;
	
	public Metadata(String size, int bytes, boolean isDir, boolean isDeleted,
			String rev, String hash, boolean thumbExists, String icon,
			Date modified, String root, String path, String mimeType, List<Metadata> contents) {
		super();
		this.size = size;
		this.bytes = bytes;
		this.isDir = isDir;
		this.isDeleted = isDeleted;
		this.rev = rev;
		this.hash = hash;
		this.thumbExists = thumbExists;
		this.icon = icon;
		this.modified = modified;
		this.root = root;
		this.path = path;
		this.mimeType = mimeType;
		this.contents = contents;
	}

	public String getSize() {
		return size;
	}

	public int getBytes() {
		return bytes;
	}

	public boolean isDir() {
		return isDir;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public String getRev() {
		return rev;
	}

	public String getHash() {
		return hash;
	}

	public boolean isThumbExists() {
		return thumbExists;
	}

	public String getIcon() {
		return icon;
	}

	public Date getModified() {
		return modified;
	}

	public String getRoot() {
		return root;
	}
	
	public String getPath() {
		return path;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public List<Metadata> getContents() {
		return contents;
	}

	public void setSize( String size ) {
	    this.size = size;
	}

	public void setBytes( int bytes ) {
	    this.bytes = bytes;
	}

	public void setIsDir( boolean isDir ) {
	    this.isDir = isDir;
	}

	public void setIsDeleted( boolean isDeleted ) {
	    this.isDeleted = isDeleted;
	}

	public void setRev( String rev ) {
	    this.rev = rev;
	}

	public void setHash( String hash ) {
	    this.hash = hash;
	}

	public void setThumbExists( boolean thumbExists ) {
	    this.thumbExists = thumbExists;
	}

	public void setIcon( String icon ) {
	    this.icon = icon;
	}

	public void setModified( Date modified ) {
	    this.modified = modified;
	}

	public void setRoot( String root ) {
	    this.root = root;
	}

	public void setPath( String path ) {
	    this.path = path;
	}

	public void setMimeType( String mimeType ) {
	    this.mimeType = mimeType;
	}

	public void setContents( List<Metadata> contents ) {
	    this.contents = contents;
	}
}
