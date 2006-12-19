/*
 *  Version: 1.0
 *
 *  The contents of this file are subject to the OpenVPMS License Version
 *  1.0 (the 'License'); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *  http://www.openvpms.org/license/
 *
 *  Software distributed under the License is distributed on an 'AS IS' basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 *  for the specific language governing rights and limitations under the
 *  License.
 *
 *  Copyright 2006 (C) OpenVPMS Ltd. All Rights Reserved.
 *
 *  $Id$
 */

package org.openvpms.report;

import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.MediaTray;


/**
 * Print properties.
 *
 * @author <a href="mailto:support@openvpms.org">OpenVPMS Team</a>
 * @version $LastChangedDate: 2006-05-02 05:16:31Z $
 */
public class PrintProperties {

    /**
     * The printer name.
     */
    private final String printerName;

    /**
     * The media size name.
     */
    private MediaSizeName mediaSize;

    /**
     * The media tray.
     */
    private MediaTray mediaTray;


    /**
     * Constructs a new <code>PrintProperties</code>.
     *
     * @param printerName the printer name
     */
    public PrintProperties(String printerName) {
        this.printerName = printerName;
    }

    /**
     * Returns the printer name.
     *
     * @return the printer name
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the media size.
     *
     * @param size the media size
     */
    public void setMediaSize(MediaSizeName size) {
        mediaSize = size;
    }

    /**
     * Returns the media size.
     *
     * @return the media size. May be <code>null</code>
     */
    public MediaSizeName getMediaSize() {
        return mediaSize;
    }

    /**
     * Sets the media tray.
     *
     * @param tray the tray
     */
    public void setMediaTray(MediaTray tray) {
        mediaTray = tray;
    }

    /**
     * Returns the media tray.
     *
     * @return the media tray. May be <code>null</code>
     */
    public MediaTray getMediaTray() {
        return mediaTray;
    }

}
