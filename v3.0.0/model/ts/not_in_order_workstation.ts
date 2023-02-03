import { DateTime } from 'apikana/default-types'

export interface NotInOrderWorkstationRequest {
    /**
     * The date and time when the app requested the block ID.
     *
     * @format date-time
     */
    requestTimestamp: DateTime

    /**
     * Unique identifier of the sorting unit at a location.
     * @maxLength 200
     */
    sortingUnitKey: string

    /**
     * The NiO-Workstation ID
     *
     */
    nioWorkstationId: string
}
