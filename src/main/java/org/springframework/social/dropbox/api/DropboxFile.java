package org.springframework.social.dropbox.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Dropbox File Details
 * 
 * @author Robert Drysdale
 * 
 */
public class DropboxFile implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contentType;
    private long size;
    private InputStream inputStream;
    private byte[] fileBytes;


    public DropboxFile( String contentType, long size, InputStream inputStream ) {
	this.contentType = contentType;
	this.size = size;
	this.inputStream = inputStream;
	try {
	    byte[] ret = new byte[(int) this.size];
	    for( int i = 0; i < size; i++ ) {
		ret[i] = (byte) this.inputStream.read();
	    }
	    this.fileBytes = ret;
	} catch( IOException ioe ) {

	}

    }


    public String getContentType() {
	return contentType;
    }


    public long getSize() {
	return size;
    }


    public InputStream getInputStream() {
	return inputStream;
    }


    public byte[] getBytes() throws IOException {
	byte[] ret = new byte[(int) size];
	for( int i = 0; i < size; i++ ) {
	    ret[i] = (byte) inputStream.read();
	}

	return ret;
    }


    public byte[] getFileBytes() {
        return fileBytes;
    }


    public void setFileBytes( byte[] fileBytes ) {
        this.fileBytes = fileBytes;
    }


    public void setContentType( String contentType ) {
        this.contentType = contentType;
    }


    public void setSize( long size ) {
        this.size = size;
    }
}
