package org.geduino.ros.core.transport.model;

import org.geduino.ros.core.messages.model.Message;
import org.geduino.ros.core.transport.exception.RosTransportSerializationException;

public interface MessageReader<T extends Message> {

	T read() throws RosTransportSerializationException;
	
}
