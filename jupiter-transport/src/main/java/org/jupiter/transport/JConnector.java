package org.jupiter.transport;

import org.jupiter.rpc.Directory;
import org.jupiter.rpc.UnresolvedAddress;

/**
 * jupiter
 * org.jupiter.transport
 *
 * @author jiachun.fjc
 */
public interface JConnector<C> extends Transporter {

    /**
     * Connect to the remote peer.
     */
    C connect(UnresolvedAddress remoteAddress);

    /**
     * Connect to the remote peer.
     */
    C connect(UnresolvedAddress remoteAddress, boolean async);

    /**
     * Sets auto manage the connections
     */
    void manageConnection(Directory directory);

    /**
     * Wait until the connections is available
     */
    void waitForAvailable(Directory directory, long timeoutMillis);

    /**
     * Server options [parent, child]
     */
    JConfig config();

    /**
     * Shutdown the server
     */
    void shutdownGracefully();
}
