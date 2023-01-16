import kotlin.random.Random

interface Command{
    fun execute(): Any
}

fun MutableList<Email>.toEmail(cid: Int) = Email(
    eId = StrictMath.abs(Random.nextInt()),
    cId = cid,
    type = this
)

fun AddContactRequest.toContact() = Contact(
    id = StrictMath.abs(Random.nextInt()),
    attributes = this@toContact.toAttributes,
    address = this@toContact.address.toAddress,
    email = this@toContact.email.toEmail(id),
    groups = this@toContact.groups,
    phoneNum = this@toContact.phoneNum
)

fun UpdateContactRequest.toContact() = Contact(
    id = this@toContact.id,
    attributes = this@toContact.attributes,
    address = this@toContact.address,
    email = this@toContact.email,
    groups = this@toContact.groups,
    phoneNum = this@toContact.phoneNum
)


class AddContactCommand(
    private val request: AddContactRequest
) : Command {
    override fun execute(): Any {
        return Storage.addContact(request.toContact())
    }
}

class DeleteContactCommand(
    private val contactId: Int,
) : Command {
    override fun execute(): Any = Storage.deleteContact(contactId)
}

class SearchContactCommand (
    private val toSearch: String
): Command {
    override fun execute(): Any = Storage.searchContact(toSearch)
}

class UpdateContactCommand (
    private val oldContactId: Int,
    private val request: UpdateContactRequest
) : Command {
    override fun execute(): Any =
        Storage.updateContact(oldContactId, request.toContact())
}

class ListContactCommand: Command{
    override fun execute(): Any = Storage.listAllContacts()
}
