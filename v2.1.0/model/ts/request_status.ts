import { Int } from 'apikana/default-types'

/**
 * Response of the device to a Request.
 */
export interface RequestStatus {
    /**
     * The date+timestamp which identifies the point in time, where the information was generated, including milliseconds.
     *
     * @format date-time
     */
    timestamp: string

    /**
     * Unique identifier of the sorting center.
     * @maxLength 200
     */
    locationKey: string

    state: RequestState

    /**
     * The Id of the message sent by the machine. An error Id in case of an error.
     */
    messageId?: Int

    /**
     * May contain additional information on the status, e.g. error reason
     * in case of ERROR. Messages are not meant to be processed
     * automatically but should just be used for problem
     * tracking.
     */
    message?: string
}

export enum RequestState {
    OK,
    ERROR,
    PROCESSING
}
