encrypt:
	sops --encrypt --age $$(cat recipients.txt) text.txt > text.txt.enc

decrypt:
	sops --decr

.ONESHELL:

edit:
	export SOPS_AGE_KEY_FILE=$$(pwd)/key.age
	sops text.txt.enc