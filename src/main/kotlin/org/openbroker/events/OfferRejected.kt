package org.openbroker.events

import org.openbroker.model.Reference

/**
 * An event that may be sent by the broker to indicate that
 * the offer has been rejected
 */
data class OfferRejected(override val brokerReference: Reference): OpenBrokerEvent